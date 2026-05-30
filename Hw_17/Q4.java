import javax.swing.*;

public class Q4 extends JFrame {

    public Q4() {

        setTitle("Typing Tutor");
        setSize(700,400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(50,20,550,80);
        add(textArea);

        JButton q = new JButton("Q");
        q.setBounds(20,130,50,50);
        add(q);

        JButton w = new JButton("W");
        w.setBounds(75,130,50,50);
        add(w);

        JButton e = new JButton("E");
        e.setBounds(130,130,50,50);
        add(e);

        JButton r = new JButton("R");
        r.setBounds(185,130,50,50);
        add(r);

        JButton t = new JButton("T");
        t.setBounds(240,130,50,50);
        add(t);

        JButton y = new JButton("Y");
        y.setBounds(295,130,50,50);
        add(y);

        JButton u = new JButton("U");
        u.setBounds(350,130,50,50);
        add(u);

        JButton i = new JButton("I");
        i.setBounds(405,130,50,50);
        add(i);

        JButton o = new JButton("O");
        o.setBounds(460,130,50,50);
        add(o);

        JButton p = new JButton("P");
        p.setBounds(515,130,50,50);
        add(p);

        JButton a = new JButton("A");
        a.setBounds(50,190,50,50);
        add(a);

        JButton s = new JButton("S");
        s.setBounds(105,190,50,50);
        add(s);

        JButton d = new JButton("D");
        d.setBounds(160,190,50,50);
        add(d);

        JButton f = new JButton("F");
        f.setBounds(215,190,50,50);
        add(f);

        JButton g = new JButton("G");
        g.setBounds(270,190,50,50);
        add(g);

        JButton h = new JButton("H");
        h.setBounds(325,190,50,50);
        add(h);

        JButton j = new JButton("J");
        j.setBounds(380,190,50,50);
        add(j);

        JButton k = new JButton("K");
        k.setBounds(435,190,50,50);
        add(k);

        JButton l = new JButton("L");
        l.setBounds(490,190,50,50);
        add(l);

        setVisible(true);
    }

    public static void main(String[] args) {

        new Q4();
    }
}
