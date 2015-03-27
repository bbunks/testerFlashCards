package com.BrendenBunker.events;

import com.BrendenBunker.Main;

import java.util.Timer;

/**
 * Created by Nuiofrd on 3/26/2015.
 */
public class CorrectLabel {
    Timer timer;
    public void isCorrect(String input, String realWord) throws InterruptedException {
        timer = new Timer();
        if (input.toLowerCase().contentEquals(realWord)){
            Main.gui.correctLabel.setText("Correct");
            timer.wait(5);
            Main.gui.correctLabel.setText("");
        } else {
            Main.gui.correctLabel.setText("wrong");
            timer.wait(5);
            Main.gui.correctLabel.setText(realWord);
        }
    }
}
