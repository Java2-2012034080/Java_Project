package for_test_items;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeBackground extends JFrame implements ActionListener{
	
	
	private JPanel panel;
	private JButton but1;
	private JButton but2;
	
	ChangeBackground(){
		
		this.setSize(300, 200);
		panel = new JPanel();
		add(panel);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		but1 = new JButton("노란색");
		but2 = new JButton("파란색");
		panel.add(but1);
		panel.add(but2);
		
		but1.addActionListener(this);
		but2.addActionListener(this);
		
		panel.setBackground(Color.black);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==but1)
			panel.setBackground(Color.YELLOW);
		else if(e.getSource()==but2)
			panel.setBackground(Color.BLUE);
	}
}
