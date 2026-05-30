import javax.swing.*;

public class Q3 extends JFrame {

    public Q3() {

        setTitle("Printer");
        setSize(500,350);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel printer = new JLabel("Printer: MyPrinter");
        printer.setBounds(20,20,200,30);
        add(printer);

        JCheckBox image = new JCheckBox("Image");
        image.setBounds(20,70,100,30);
        add(image);

        JCheckBox text = new JCheckBox("Text");
        text.setBounds(20,100,100,30);
        add(text);

        JCheckBox code = new JCheckBox("Code");
        code.setBounds(20,130,100,30);
        add(code);

        JRadioButton selection = new JRadioButton("Selection");
        selection.setBounds(180,70,100,30);
        add(selection);

        JRadioButton all = new JRadioButton("All");
        all.setBounds(180,100,100,30);
        add(all);

        JRadioButton applet = new JRadioButton("Applet");
        applet.setBounds(180,130,100,30);
        add(applet);

        ButtonGroup group = new ButtonGroup();
        group.add(selection);
        group.add(all);
        group.add(applet);

        JLabel quality = new JLabel("Print Quality");
        quality.setBounds(20,190,100,30);
        add(quality);

        String[] choices = {"High", "Medium", "Low"};

        JComboBox combo = new JComboBox(choices);
        combo.setBounds(130,190,120,30);
        add(combo);

        JCheckBox file = new JCheckBox("Print To File");
        file.setBounds(20,230,120,30);
        add(file);

        JButton ok = new JButton("OK");
        ok.setBounds(300,60,100,30);
        add(ok);

        JButton cancel = new JButton("Cancel");
        cancel.setBounds(300,100,100,30);
        add(cancel);

        JButton setup = new JButton("Setup");
        setup.setBounds(300,140,100,30);
        add(setup);

        JButton help = new JButton("Help");
        help.setBounds(300,180,100,30);
        add(help);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Q3();
    }
}