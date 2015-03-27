package com.BrendenBunker.events;

/**
 * Created by Nuiofrd on 10/23/2014.
 */

import com.BrendenBunker.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class iActionLister implements ActionListener{
    @Override

    public void actionPerformed(ActionEvent i) {
        callMethods.typeAccent('í');
        Main.gui.userInput.requestFocus();
    }


}
