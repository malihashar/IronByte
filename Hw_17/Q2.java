import javax.swing.*;

public class Q2 extends JFrame {

    public Q2() {

        setTitle("Calculator");
        setSize(300,350);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField display = new JTextField();
        display.setBounds(20,20,240,30);
        add(display);

        JButton b7 = new JButton("7");
        b7.setBounds(20,70,50,50);
        add(b7);

        JButton b8 = new JButton("8");
        b8.setBounds(80,70,50,50);
        add(b8);

        JButton b9 = new JButton("9");
        b9.setBounds(140,70,50,50);
        add(b9);

        JButton divide = new JButton("/");
        divide.setBounds(200,70,50,50);
        add(divide);

        JButton b4 = new JButton("4");
        b4.setBounds(20,130,50,50);
        add(b4);

        JButton b5 = new JButton("5");
        b5.setBounds(80,130,50,50);
        add(b5);

        JButton b6 = new JButton("6");
        b6.setBounds(140,130,50,50);
        add(b6);

        JButton multiply = new JButton("*");
        multiply.setBounds(200,130,50,50);
        add(multiply);

        JButton b1 = new JButton("1");
        b1.setBounds(20,190,50,50);
        add(b1);

        JButton b2 = new JButton("2");
        b2.setBounds(80,190,50,50);
        add(b2);

        JButton b3 = new JButton("3");
        b3.setBounds(140,190,50,50);
        add(b3);

        JButton minus = new JButton("-");
        minus.setBounds(200,190,50,50);
        add(minus);

        JButton b0 = new JButton("0");
        b0.setBounds(20,250,50,50);
        add(b0);

        JButton dot = new JButton(".");
        dot.setBounds(80,250,50,50);
        add(dot);

        JButton equal = new JButton("=");
        equal.setBounds(140,250,50,50);
        add(equal);

        JButton plus = new JButton("+");
        plus.setBounds(200,250,50,50);
        add(plus);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Q2();
    }
}
