package GUIAWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalC extends Frame {
    private TextField display;
    private String currentInput;

    public CalC() {
        super("Calculator");
        setLayout(new BorderLayout());

        display = new TextField();
        display.setEditable(false);
        display.setBackground(Color.WHITE);
        add(display, BorderLayout.NORTH);

        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        addWindowListener(new MyWindowAdapter());

        setSize(400, 500);
        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Button source = (Button) e.getSource();
            String buttonText = source.getLabel();

            if (buttonText.equals("=")) {
                evaluateExpression();
            } else if (buttonText.equals("C")) {
                clearInput();
            } else {
                updateInput(buttonText);
            }
        }
    }

    private void evaluateExpression() {
        try {
            double result = evaluate(currentInput);
            display.setText(String.valueOf(result));
        } catch (NumberFormatException | ArithmeticException ex) {
            display.setText("Error");
        }
    }

    private void clearInput() {
        currentInput = "";
        display.setText("");
    }

    private void updateInput(String input) {
        currentInput += input;
        display.setText(currentInput);
    }

    private double evaluate(String expression) {
        // Implement your own expression evaluation logic here
        // For simplicity, using a placeholder method
        return 0.0;
    }

    public static void main(String[] args) {
        new CalC();
    }
}
