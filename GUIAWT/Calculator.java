package GUIAWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener {

    private TextField textField;

    private String operator = "";
    private double firstOperand = 0;

    public Calculator() {
        setTitle("Simple Calculator");
        setLayout(new BorderLayout());

        textField = new TextField();
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        setSize(400, 400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "=":
                calculateResult();
                break;
            case "C":
                clear();
                break;
            default:
                handleInput(command);
                break;
        }
    }

    private void handleInput(String input) {
        if (input.matches("[0-9]")) {
            textField.setText(textField.getText() + input);
        } else if (isOperator(input)) {
            operator = input;
            firstOperand = Double.parseDouble(textField.getText());
            textField.setText("");
        } else if (input.equals(".")) {
            if (!textField.getText().contains(".")) {
                textField.setText(textField.getText() + ".");
            }
        }
    }

    private void calculateResult() {
        if (!operator.isEmpty()) {
            double secondOperand = Double.parseDouble(textField.getText());
            double result = 0;

            switch (operator) {
                case "+":
                    result = firstOperand + secondOperand;
                    break;
                case "-":
                    result = firstOperand - secondOperand;
                    break;
                case "*":
                    result = firstOperand * secondOperand;
                    break;
                case "/":
                    if (secondOperand != 0) {
                        result = firstOperand / secondOperand;
                    } else {
                        textField.setText("Error");
                        return;
                    }
                    break;
            }

            textField.setText(String.valueOf(result));
            operator = "";
            firstOperand = result;
        }
    }

    private void clear() {
        textField.setText("");
        operator = "";
        firstOperand = 0;
    }

    private boolean isOperator(String input) {
        return "+-*/".contains(input);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
