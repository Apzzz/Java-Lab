import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

class cal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	Border border = BorderFactory.createLineBorder(Color.BLACK);
	JButton n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, p, s, m, d, e, c, mod;
	JTextField re = new JTextField(20);
	JPanel pan = new JPanel();
	int nn1, nn2, nn;
	String oper;

	cal() {

		getContentPane().setBackground(Color.GRAY);

		c = new JButton("C");
		c.setBackground(Color.LIGHT_GRAY);
		c.setBorder(border);
		n1 = new JButton("1");
		n1.setBackground(Color.LIGHT_GRAY);
		n1.setBorder(border);
		n2 = new JButton("2");
		n2.setBorder(border);
		n2.setBackground(Color.LIGHT_GRAY);
		n3 = new JButton("3");
		n3.setBackground(Color.LIGHT_GRAY);
		n3.setBorder(border);
		n4 = new JButton("4");
		n4.setBackground(Color.LIGHT_GRAY);
		n4.setBorder(border);
		n5 = new JButton("5");
		n5.setBackground(Color.LIGHT_GRAY);
		n5.setBorder(border);
		n6 = new JButton("6");
		n6.setBackground(Color.LIGHT_GRAY);
		n6.setBorder(border);
		n7 = new JButton("7");
		n7.setBackground(Color.LIGHT_GRAY);
		n7.setBorder(border);
		n8 = new JButton("8");
		n8.setBackground(Color.LIGHT_GRAY);
		n8.setBorder(border);
		n9 = new JButton("9");
		n9.setBackground(Color.LIGHT_GRAY);
		n9.setBorder(border);
		n0 = new JButton("0");
		n0.setBorder(border);
		n0.setBackground(Color.LIGHT_GRAY);
		p = new JButton("+");
		p.setBorder(border);
		p.setBackground(Color.LIGHT_GRAY);
		s = new JButton("*");
		s.setBorder(border);
		s.setBackground(Color.LIGHT_GRAY);
		m = new JButton("-");
		m.setBorder(border);
		m.setBackground(Color.LIGHT_GRAY);
		d = new JButton("/");
		d.setBorder(border);
		d.setBackground(Color.LIGHT_GRAY);
		e = new JButton("=");
		e.setBorder(border);
		e.setBackground(Color.LIGHT_GRAY);
		mod = new JButton("%");
		mod.setBorder(border);
		mod.setBackground(Color.LIGHT_GRAY);
		re.setBackground(Color.WHITE);
		re.setPreferredSize(new Dimension(40, 30));
		re.setHorizontalAlignment(JTextField.CENTER);
		setLayout(new FlowLayout());
		add(re);
		add(c);
		pan.setPreferredSize(new Dimension(200, 200));
		pan.setLayout(new GridLayout(4, 4));

		pan.add(n1);
		pan.add(n2);
		pan.add(n3);
		pan.add(p);
		pan.add(n4);
		pan.add(n5);
		pan.add(n6);
		pan.add(m);
		pan.add(n7);
		pan.add(n8);
		pan.add(n9);
		pan.add(s);
		pan.add(n0);
		pan.add(d);
		pan.add(mod);
		pan.add(e);

		add(pan);
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		n1.addActionListener(this);
		n2.addActionListener(this);
		n3.addActionListener(this);
		n4.addActionListener(this);
		n5.addActionListener(this);
		n6.addActionListener(this);
		n7.addActionListener(this);
		n8.addActionListener(this);
		n9.addActionListener(this);
		n0.addActionListener(this);
		p.addActionListener(this);
		s.addActionListener(this);
		m.addActionListener(this);
		mod.addActionListener(this);
		d.addActionListener(this);
		e.addActionListener(this);
		c.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ac) {

		JButton o = (JButton) ac.getSource();

		if (o == c) {
			re.setText("");
			oper = "";
		} else if (o == p || o == s || o == m || o == d || o == mod) {
			try {
				nn1 = Integer.parseInt(re.getText());
				oper = o.getText();
				re.setText(o.getText());
			} catch (Exception e) {
				re.setText("illegal use");
			}
		} else if (o == e) {
			nn2 = Integer.parseInt(re.getText());
			try {
				switch (oper) {
				case "+":
					nn = nn1 + nn2;
					break;
				case "-":
					nn = nn1 - nn2;
					break;
				case "/":
					nn = nn1 / nn2;
					break;
				case "*":
					nn = nn1 * nn2;
					break;
				case "%":
					nn = nn1 % nn2;
					break;
				}
				re.setText(nn1 + oper + nn2 + " = " + nn);
			} catch (ArithmeticException e) {
				// System.out.println("Division by zero");
				re.setText("Division by zero");
			}
		} else {
			String ff;
			ff = re.getText();
			if (ff == "-" || ff == "/" || ff == "+" || ff == "*" || ff == "Division by zero" || ff == "illegal use"
					|| ff == "%")
				re.setText("");
			re.setText(o.getText());
		}
	}
}

public class Calculator {

	public static void main(String[] args) {

		new cal();
	}

}