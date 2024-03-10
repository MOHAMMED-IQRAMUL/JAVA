package GUISWING;

import java.awt.Color;
import javax.swing.*;
import javax.swing.event.*;

public class JSpitPanes2 {

    static class MyFrame extends JFrame implements ListSelectionListener {

        JSplitPane sp;
        JList<String> list;
        JLabel l;

        MyFrame() {
            super("Split Demo");

            String cols[] = { "RED", "GREEN", "BLUE", "YELLOW", "MAGENTA", "ORANGE", "BLACK" };
            list = new JList<>(cols);
            list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            list.addListSelectionListener(this);
            JScrollPane p1 = new JScrollPane(list);

            l = new JLabel(" ");
            l.setBackground(Color.RED);
            l.setOpaque(true);
            JScrollPane p2 = new JScrollPane(l);

            sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, p1, p2);
            sp.setDividerLocation(200);
            // JTabbedPane tp=new JTabbedPane();
            // tp.addTab("Color",p1);
            // tp.addTab("Label",p2);

            add(sp);

        }

        public void valueChanged(ListSelectionEvent e) {
            String s = (String) list.getSelectedValue();
            switch (s) {

                case "RED":
                    l.setBackground(Color.red);
                    break;
                case "GREEN":
                    l.setBackground(Color.green);
                    break;
                case "BLUE":
                    l.setBackground(Color.blue);
                    break;
                case "MAGENTA":
                    l.setBackground(Color.magenta);
                    break;
                case "YELLOW":
                    l.setBackground(Color.yellow);
                    break;
                case "ORANGE":
                    l.setBackground(Color.orange);
                    break;
                case "BLACK":
                    l.setBackground(Color.black);
                    break;
            }
        }

    }

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(800, 800);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
