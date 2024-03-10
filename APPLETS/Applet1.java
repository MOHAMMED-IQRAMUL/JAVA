
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

@Deprecated
public class Applet1 extends Applet implements ActionListener {
    TextField tf1 = new TextField(10);
    TextField tf2 = new TextField(10);
    TextField tf3 = new TextField(10);

    Label l1 = new Label("FIRST NO ");
    Label l2 = new Label("SECOND NO ");
    Label l3 = new Label("SUM IS ");

    Button B1 = new Button("ADD");

    @Override
    public void init() {

        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);
        add(B1);
        B1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == B1) {
            int N1 = Integer.parseInt(tf1.getText());
            int N2 = Integer.parseInt(tf2.getText());
            tf3.setText("SUM IS : " + (N1 + N2));
        }
    }

    public static void main(String[] args) {
    }

}