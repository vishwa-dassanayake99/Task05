package LPLCricket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	static JButton button;
	static JLabel label;
	static JFrame frame = new JFrame("6CS002-Task05");
	static JPanel panel;
	
	public static void main (String[]args) {
		GUI gui = new GUI();
		
		JFrame frame = new JFrame("6CS002-Task05-1916430");
		JPanel panel = new JPanel();
		JButton btn = new JButton();
		
		panel.add(btn);
		frame.add(panel);
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		label = new JLabel("ForEach Function.");
		panel.add(label);
		panel.add(Box.createVerticalStrut(1));
		button = new JButton("Cricket01");
		panel.add(button);
		button.addActionListener(gui); 
		panel.add(Box.createVerticalStrut(10));
		
		label = new JLabel("Parallel Streaming Function.");
		panel.add(label);
		panel.add(Box.createVerticalStrut(1));
		button = new JButton("Cricket02");
		panel.add(button);
		button.addActionListener(gui); 
		panel.add(Box.createVerticalStrut(10));

		label = new JLabel("Min, Map, Reduce, Collect Function.");
		panel.add(label);
		panel.add(Box.createVerticalStrut(1));
		button = new JButton("Cricket03");
		panel.add(button);
		button.addActionListener(gui); 
		panel.add(Box.createVerticalStrut(10));

		label = new JLabel("Filter & ForEach Function.");
		panel.add(label);
		panel.add(Box.createVerticalStrut(1));
		button = new JButton("Cricket04");
		panel.add(button);
		button.addActionListener(gui); 
		panel.add(Box.createVerticalStrut(10));

		label = new JLabel("Sorted Function");
		panel.add(label);
		panel.add(Box.createVerticalStrut(1));
		button = new JButton("Cricket05");
		panel.add(button);
		button.addActionListener(gui); 
		panel.add(Box.createVerticalStrut(10));
		
		frame.setSize(450, 450);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand(); 
		if (s.equals("Cricket01")) { 
			Cricket01.readAndWrite();
		} else if (s.equals("Cricket02")) { 
			Cricket02.readAndWrite();
		} else if (s.equals("Cricket03")) { 
			Cricket03.readAndWrite();
		} else if (s.equals("Cricket04")) {
			Cricket04.readAndWrite();
		} else if (s.equals("Cricket05")) { 
			Cricket05.readAndWrite();
		} 
	}

}
