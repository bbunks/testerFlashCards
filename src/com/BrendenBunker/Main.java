package com.BrendenBunker;

import com.BrendenBunker.events.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main{

    public static ScreenGenerator gui;
    public static double tick, sec;
    public static int total = 0, right = 0;
    public static boolean start, read;
    public static void main(String[] args) {
        gui = new ScreenGenerator();
        gui.setupScreen();
        double i = 0;
        tick = 0;
        while (true) {
            if (start) {
                if (!read) {
                    read = true;
                    sec = tick;
                }
                if (sec >= sec + 5){
                    gui.correctLabel.setText("");
                    start = false;
                }
            }
            int h = gui.getHeight();
            int w = gui.getWidth();
            i++;
            if (i > 300000){
                tick++;
                i = 0;
            }
            Insets insets = gui.getInsets();
            w = w - (insets.left + insets.right);

            if (!gui.userInput.getText().contentEquals("")){
                gui.correctLabel.setText("");
            }

            gui.wordLabel.setBounds(0, 0, w*3/4, h / 6);
            gui.wordLabel.setFont(new Font(gui.wordLabel.getFont().getName(), Font.PLAIN, h * 1 / 8));
            gui.enter.setBounds(w * 3 / 4, h * 1 / 4, w * 1 / 4, h * 1 / 6);
            gui.userInput.setBounds(0, h*1/4, w*3/4, h / 6);
            gui.userInput.setFont(new Font(gui.userInput.getFont().getName(), Font.PLAIN, h * 1 / 6));
            gui.correctLabel.setBounds(w / 2, 0, w * 2 / 4, h / 6);
            gui.correctLabel.setFont(new Font(gui.wordLabel.getFont().getName(), Font.PLAIN, h * 1 / 8));
            gui.numbCorrectLabel.setBounds(0, h*3/4, w*2/4, h / 4);
            gui.totalLabel.setBounds(w/2, h*3/4, w*2/4, h / 4);
            gui.aAccent.setBounds(w / 6 * 0, h - (h / 4) - 32, w / 6, h / 4);
            gui.eAccent.setBounds(w / 6 * 1, h - (h / 4) - 32, w / 6, h / 4);
            gui.iAccent.setBounds(w / 6 * 2, h - (h / 4) - 32, w / 6, h / 4);
            gui.oAccent.setBounds(w / 6 * 3, h - (h / 4) - 32, w / 6, h / 4);
            gui.uAccent.setBounds(w / 6 * 4, h - (h / 4) - 32, w / 6, h / 4);
            gui.nAccent.setBounds(w / 6 * 5, h - (h / 4) - 32, w - w / 6 * 5, h / 4);
            gui.wordLabel.setText(tick + "");
        }

    }

    public static class ScreenGenerator extends JFrame{

        //Intro
        public JButton enter,eAccent, aAccent, iAccent, oAccent, uAccent, nAccent;
        public JLabel wordLabel, correctLabel, numbCorrectLabel, totalLabel;
        public JTextField userInput;


        //MainCode
        public ScreenGenerator() {
            Submit submitAL = new Submit();
            eActionLister eAL = new eActionLister();
            aActionLister aAL = new aActionLister();
            iActionLister iAL = new iActionLister();
            oActionLister oAL = new oActionLister();
            uActionLister uAL = new uActionLister();
            nActionLister nAL = new nActionLister();


            setLayout(null);


            //make componets
            enter = new JButton("Submit");
            enter.addActionListener(submitAL);
            wordLabel = new JLabel("hello");
            numbCorrectLabel = new JLabel("Correct: " + right);
            totalLabel = new JLabel("Total: " + total);
            correctLabel = new JLabel("hello");
            userInput = new JTextField(15);
            aAccent = new JButton("á");
            aAccent.addActionListener(aAL);
            eAccent = new JButton("è");
            eAccent.addActionListener(eAL);
            iAccent = new JButton("í");
            iAccent.addActionListener(oAL);
            oAccent = new JButton("ó");
            oAccent.addActionListener(iAL);
            uAccent = new JButton("ú");
            uAccent.addActionListener(uAL);
            nAccent = new JButton("ñ");
            nAccent.addActionListener(nAL);

            wordLabel.setHorizontalTextPosition(SwingConstants.CENTER);

            //draw componets

            add(userInput);
            userInput.setFont(new Font(wordLabel.getFont().getName(), Font.PLAIN, 32));
            add(enter);
            add(wordLabel);
            wordLabel.setFont(new Font(wordLabel.getFont().getName(), Font.PLAIN, 32));
            add(correctLabel);
            add(aAccent);
            add(eAccent);
            add(iAccent);
            add(oAccent);
            add(uAccent);
            add(nAccent);
            add(numbCorrectLabel);
            add(totalLabel);

            addBindings();

        }

        private void addBindings() {
            InputMap inputMap = userInput.getInputMap();
            final KeyStroke submit = KeyStroke.getKeyStroke('\n');
            inputMap.put(submit, new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    enter.doClick();
                }
            });
            KeyStroke a = KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.CTRL_MASK);
            inputMap.put(a, new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    aAccent.doClick();
                }
            });
            KeyStroke e = KeyStroke.getKeyStroke(KeyEvent.VK_E, Event.CTRL_MASK);
            inputMap.put(e, new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    eAccent.doClick();
                }
            });
            KeyStroke i = KeyStroke.getKeyStroke(KeyEvent.VK_I, Event.CTRL_MASK);
            inputMap.put(i, new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    iAccent.doClick();
                }
            });
            KeyStroke o = KeyStroke.getKeyStroke(KeyEvent.VK_O, Event.CTRL_MASK);
            inputMap.put(o, new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    oAccent.doClick();
                }
            });
            KeyStroke u = KeyStroke.getKeyStroke(KeyEvent.VK_U, Event.CTRL_MASK);
            inputMap.put(u, new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    uAccent.doClick();
                }
            });
            KeyStroke n = KeyStroke.getKeyStroke(KeyEvent.VK_N, Event.CTRL_MASK);
            inputMap.put(n, new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    nAccent.doClick();
                }
            });
        }

        public void setupScreen() {
            //Setup screen
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.setVisible(true);
            this.setTitle("Flashcards");
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            double width = screenSize.getWidth();
            double height = screenSize.getHeight();
            int h = (int) height/4;
            int w = (int) width/4;
            this.setSize(w, h);

        }

    }
}
