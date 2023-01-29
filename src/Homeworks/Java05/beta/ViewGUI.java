package Homeworks.Java05.beta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ViewGUI extends JFrame implements ActionListener {
    static JFrame frame;
    static JTextField result;
    public String a = "";
    public String b = "";
    public String operation = "";

    public static void main(String[] args) {
        ViewGUI listen = new ViewGUI();

        frame = new JFrame("Calculator");

        result = new JTextField(16);
        result.setEditable(false);
        result.setText("0");

        ArrayList<JButton> btns = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            JButton jTmpButton = new JButton(Integer.toString(i));
            jTmpButton.addActionListener(listen);
            btns.add(jTmpButton);
        }

        List<String> operations = Arrays.asList("+", "-", "/", "*", "c", "=");

        JPanel buttons = new JPanel();
        btns.forEach(buttons::add);
        operations.forEach(it -> {
            JButton jTmpButton = new JButton(it);
            jTmpButton.addActionListener(listen);
            buttons.add(jTmpButton);
        });

        GridLayout numsAndOpsLayout = new GridLayout(4, 4);
        buttons.setLayout(numsAndOpsLayout);

        JPanel mainPanel = new JPanel();
        mainPanel.add(result);
        mainPanel.add(buttons);

        frame.add(mainPanel);
        frame.setSize(360, 180);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println(e.getActionCommand());

        String s = e.getActionCommand();
        if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
            if (operation.equals("")) {
                a = a + s;
            } else
                b = b + s;
            result.setText(a + operation + b);
        } else if (s.charAt(0) == 'c') {
            a = operation = b = "";
            result.setText("0");
        } else if (s.charAt(0) == '=') {
            int rslt = switch (operation) {
                case "+" -> Integer.parseInt(a) + Integer.parseInt(b);
                case "-" -> Integer.parseInt(a) - Integer.parseInt(b);
                case "*" -> Integer.parseInt(a) * Integer.parseInt(b);
                case "/" -> Integer.parseInt(a) / Integer.parseInt(b);
                default -> 0;
            };
            a = String.valueOf(rslt);
            result.setText(a);
            operation = b = "";

        } else {
            if (operation.equals(""))
                operation = s;
            result.setText(a + operation + b);
        }
    }
}


