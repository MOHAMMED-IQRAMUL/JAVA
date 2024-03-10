package GUIAWT;

import java.awt.*;
import java.awt.event.*;

public class Paints2 {

    static class MyFrame extends Frame {
        int x = 0, y = 0;

        MyFrame() {
            super("Painting Demo");

            addMouseMotionListener(new MouseAdapter() {
                public void mouseMoved(MouseEvent me) {
                    x = me.getX();
                    y = me.getY();
                    repaint();
                }
            });

        }

        public void paint(Graphics g) {
            g.setColor(Color.GREEN);
             g.fillRect( x, y , 20,20);
         }
    }

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }

}
