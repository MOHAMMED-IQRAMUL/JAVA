package GUIAWT;

import java.awt.*;

public class AwtProg {

    public static void main(String[] args) {

        Frame frame = new Frame("MyFrame");

        Button button = new Button("Click ME!!!");

        Label label = new Label("This Is A Label");

        TextField textField = new TextField("XYZ...", 50);

        TextArea textArea = new TextArea(20, 40);

        List list = new List(5);
        list.add("ABCD,1");
        list.add("ABCD,2");
        list.add("ABCD,3");
        list.add("ABCD,4");
        list.add("ABCD,5");

        Checkbox checkBox = new Checkbox("My CheckBox");

        Choice choice = new Choice();
        choice.add("ABCD,1");
        choice.add("ABCD,2");
        choice.add("ABCD,3");
        choice.add("ABCD,4");
        choice.add("ABCD,5");

        frame.setLayout(new FlowLayout());

        frame.add(button);
        frame.add(label);
        frame.add(textField);
        frame.add(list);
        frame.add(checkBox);
        frame.add(choice);
        frame.add(textArea);

        frame.setSize(500, 500);
        frame.setVisible(true);

    }
}