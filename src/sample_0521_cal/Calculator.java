package sample_0521_cal;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
	
	private JPanel pannel;
	private JTextField text;
	private JButton[] button;
	private String[] butname={
			"7","8","9","/","%",
			"4","5","6","*"," ",
			"1","2","3","-","C",
			"0",".","+/-","+","="
	};//

	public Calculator(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculator");
		setSize(1400,1400);
		
		text = new JTextField();
		pannel = new JPanel();
		text.setText("impossible");
		text.setEnabled(false);
		
		
		pannel.setLayout(new GridLayout(0,5,1,1));
		button = new JButton[20];
		
		for(int i=0; i<20; i++){
			button[i] = new JButton(butname[i]);
			pannel.add(button[i]);
		}
		
		add(text, BorderLayout.NORTH);
		add(pannel, BorderLayout.CENTER);
		setVisible(true);
		pack();
		
	}
}
