package GUIAWT;

import java.awt.*;
import java.awt.event.*;

public class Buttons {

    static class MyFrame extends Frame implements ActionListener {
        int count = 0;
        Label l;
        Button b;

        public MyFrame() {
            super("Button Demo");

            l = new Label("    " + count);
            b = new Button("Click");
            b.addActionListener(this);

            setLayout(new FlowLayout());
            add(l);
            add(b);

 addWindowListener(new MyWindowAdapter());
        }

        public void actionPerformed(ActionEvent e) {
            count++;
            l.setText("  " + count);
        }
    }
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);

    }
}
