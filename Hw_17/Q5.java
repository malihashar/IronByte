import javax.swing.*;
import java.awt.event.*;

public class Q5 extends JFrame {

    public Q5() {

        setTitle("Temperature Converter");
        setSize(400,250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Fahrenheit");
        label1.setBounds(50,40,100,30);
        add(label1);

        JTextField text = new JTextField();
        text.setBounds(160,40,120,30);
        add(text);

        JButton button = new JButton("Convert");
        button.setBounds(130,100,100,30);
        add(button);

        JLabel answer = new JLabel("Celsius = ");
        answer.setBounds(120,160,200,30);
        add(answer);

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                double f = Double.parseDouble(text.getText());

                double c = (5.0 / 9.0) * (f - 32);

                answer.setText("Celsius = " + c);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {

        new Q5();
    }

    
}
