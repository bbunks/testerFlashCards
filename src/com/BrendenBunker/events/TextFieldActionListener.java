package com.BrendenBunker.events;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by Nuiofrd on 10/22/2014.
 */
public class TextFieldActionListener implements ActionListener{
    JTextField jText;
    JLabel jLabel;
    public TextFieldActionListener(JTextField jt, JLabel jl){
        jText = jt;
        jLabel = jl;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = jText.getText();
        jLabel.setText(input);
    }
}
