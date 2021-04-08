import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TrafficLight extends JFrame implements ActionListener {
	JRadioButton buttonRed, buttonYellow, buttonGreen;

	Signal green = new Signal(Color.GREEN);
	Signal yellow = new Signal(Color.YELLOW);
	Signal red = new Signal(Color.RED);

	public TrafficLight() {
		setLayout(new GridLayout(3, 2));
		buttonRed = new JRadioButton("Red");
		buttonYellow = new JRadioButton("Yellow");
		buttonGreen = new JRadioButton("Green");
		buttonRed.addActionListener(this);
		buttonYellow.addActionListener(this);
		buttonGreen.addActionListener(this);

		JPanel trafficPanel = new JPanel(new GridLayout(3, 1));
		trafficPanel.add(red);
		trafficPanel.add(yellow);
		trafficPanel.add(green);
		JPanel lightPanel = new JPanel(new FlowLayout());
		lightPanel.add(buttonRed);
		lightPanel.add(buttonYellow);
		lightPanel.add(buttonGreen);
		add(lightPanel);
		add(trafficPanel);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TrafficLight();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttonRed) {
			buttonGreen.setSelected(false);
			buttonYellow.setSelected(false);
			green.turnOn(false);
			yellow.turnOn(false);
			red.turnOn(true);
		} else if (e.getSource() == buttonYellow) {
			buttonGreen.setSelected(false);
			buttonRed.setSelected(false);
			yellow.turnOn(true);
			green.turnOn(false);
			red.turnOn(false);
		} else if (e.getSource() == buttonGreen) {
			buttonRed.setSelected(false);
			buttonYellow.setSelected(false);
			red.turnOn(false);
			yellow.turnOn(false);
			green.turnOn(true);
		}
	}
}

class Signal extends JPanel {
	Color on;
	boolean change;

	Signal(Color color) {
		on = color;
		change = false;
	}

	public void turnOn(boolean a) {
		change = a;
		repaint();
	}

	public Dimension getPreferredSize() {
		int size = (50) * 2;
		return new Dimension(size, size);
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(50, 0, 125, 250);
		if (change) {
			g.setColor(on);
		} else {
			g.setColor(Color.white);
		}
		g.fillOval(70, 10, 80, 80);
		g.setColor(Color.BLACK);
		g.drawOval(70, 10, 80, 80);
	}
}