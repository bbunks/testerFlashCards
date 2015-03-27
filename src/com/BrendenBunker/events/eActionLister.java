package com.BrendenBunker.events;

/**
 * Created by Nuiofrd on 10/23/2014.
 */

import com.BrendenBunker.Main;
import com.BrendenBunker.events.callMethods.*;
import java.awt.event.*;

public class eActionLister implements ActionListener{
    @Override

    public void actionPerformed(ActionEvent e) {
        callMethods.typeAccent('è');
        Main.gui.userInput.requestFocus();
    }


}
