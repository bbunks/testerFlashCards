package com.BrendenBunker;

/**
 * Created by Nuiofrd on 10/22/2014.
 */



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ScreenGenerator extends JFrame{

    //Intro
    JButton enter,eAccent, aAccent, iAccent, oAccent, uAccent;
    JLabel wordLabel, correctLabel;
    JTextField userInput;

    //MainCode
    public ScreenGenerator() {
        Submit submitAL = new Submit();

        setLayout(new GridLayout(4, 1));

        //make componets
        enter = new JButton("Submit");
        enter.addActionListener(submitAL);
        wordLabel = new JLabel("hello");
        correctLabel = new JLabel("hello");
        userInput = new JTextField(15);

        wordLabel.setHorizontalTextPosition(SwingConstants.CENTER);

        //draw componets
        add(wordLabel);
        add(userInput);
        add(enter);
        add(correctLabel);

    }

    public void setupScreen() {
        //Setup screen
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Flashcards");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        int h = (int) height/2;
        int w = (int) width/4;

        this.setSize(w, h);
    }

    public class Submit implements ActionListener {

        public void actionPerformed(ActionEvent submitAL) {
            String input = userInput.getText();
            wordLabel.setText(input);
        }
    }

}
