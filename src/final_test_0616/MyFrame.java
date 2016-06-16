package final_test_0616;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener{
	
	private JPanel panel;
	private JButton but1, but2;
	private JLabel label1, label2;
	private Object SubFrame;
	
	MyFrame(){
		setTitle("Main Frame");
		setSize(700,100);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		panel = new JPanel();
		add(panel);
		label1 = new JLabel("Final-test, To make new frame test");
		
		but1= new JButton("OKay");
		but2= new JButton("Cancel");	
		but1.addActionListener(this);
		but2.addActionListener(this);
		
		label2 = new JLabel("");
		panel.setLayout(new FlowLayout());
		panel.add(label1);
		panel.add(but1);
		panel.add(but2);
		panel.add(label2);
		
		
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==but1){
			new SubFrame();
			label2.setText("Make New Frame");}
		else if(e.getSource()==but2)
			label2.setText("Don't Make Frame");
			
		
	}

}
