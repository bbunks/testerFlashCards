package com.BrendenBunker.events;

/**
 * Created by Nuiofrd on 10/23/2014.
 */

import com.BrendenBunker.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class aActionLister implements ActionListener{
    @Override

    public void actionPerformed(ActionEvent a) {
        callMethods.typeAccent('á');
        Main.gui.userInput.requestFocus();
    }


}
