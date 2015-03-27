package com.BrendenBunker.events;

import com.BrendenBunker.Main;
import java.awt.event.*;
import java.sql.Time;

/**
 * Created by Nuiofrd on 10/22/2014.
 */
public class Submit implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        submit();
    }

    public void submit(){
        String input = Main.gui.userInput.getText();
        Main.total++;
        Main.gui.correctLabel.setText(input);
        String temp = Main.gui.userInput.getText();
        Main.gui.userInput.setText("");
        isCorrect(temp, "Fill this in");
        Main.gui.userInput.setText("");
    }
    static double sec;
    public static void isCorrect(String input, String realWord){
        if (input.toLowerCase().contentEquals(realWord)){
            Main.start = true;
            Main.right++;
            Main.gui.correctLabel.setText("Correct");
        } else {
            Main.gui.correctLabel.setText(realWord);
        }
    }
}


