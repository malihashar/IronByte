import javax.swing.*;

public class Q1 extends JFrame {

    public Q1() {

        setTitle("Align");
        setSize(350,250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox snap = new JCheckBox("Snap to Grid");
        snap.setBounds(20,20,120,30);
        add(snap);

        JCheckBox show = new JCheckBox("Show Grid");
        show.setBounds(20,60,120,30);
        add(show);

        JLabel xLabel = new JLabel("X:");
        xLabel.setBounds(180,20,20,30);
        add(xLabel);

        JTextField xText = new JTextField();
        xText.setBounds(210,20,80,30);
        add(xText);

        JLabel yLabel = new JLabel("Y:");
        yLabel.setBounds(180,60,20,30);
        add(yLabel);

        JTextField yText = new JTextField();
        yText.setBounds(210,60,80,30);
        add(yText);

        JButton ok = new JButton("OK");
        ok.setBounds(20,130,80,30);
        add(ok);

        JButton cancel = new JButton("Cancel");
        cancel.setBounds(110,130,80,30);
        add(cancel);

        JButton help = new JButton("Help");
        help.setBounds(200,130,80,30);
        add(help);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Q1();
    }
}