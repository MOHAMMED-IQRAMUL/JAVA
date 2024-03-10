package GUIAWT;

import java.awt.*;
import java.awt.event.*;

public class WindowAdaptersProg {

    // Outer class for handling Window Event

    static class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
    System.exit(0);
    }
    }

    static class MyFrame extends Frame {
        MyFrame() {
            super("Adapter Demo");
            addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
            System.exit(0);
            }
            });

            // use this for handling event using inner class
            addWindowListener(new MyWindowAdapter());

        }

        // Inner class used for handling event

        class MyWindowAdapter extends WindowAdapter {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
