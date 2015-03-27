package com.BrendenBunker.events;

import com.BrendenBunker.Main;
import com.BrendenBunker.Main.*;

/**
 * Created by Nuiofrd on 10/22/2014.
 */


public class callMethods {
    public static void typeAccent(char letter) {
        String temp = Main.gui.userInput.getText();
        temp = temp + letter;
        Main.gui.userInput.setText(temp);
    }
}
