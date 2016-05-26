package sample_0526_event;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;

public class KeyPad extends JFrame implements ActionListener{
	
	private JPanel panel;
	private JTextField text;
	private JButton[] button;
	private String[] butname={"1","2","3",
								"4","5","6",
								"7","8","9"};
	

	public KeyPad(){
		text= new JTextField(20);
		add(text, BorderLayout.NORTH);
		
		panel = new JPanel();
		
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0,3));
		for(int i=0; i<9; i++){
			button[i] = new JButton(butname[i]);
			button[i].addActionListener(this);
			button[i].setPreferredSize(new Dimension(100,100));
			panel.add(button[i]);
		}
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		String actionCommand = e.getActionCommand();
		text.setText(text.getText()+actionCommand);
	}

}


