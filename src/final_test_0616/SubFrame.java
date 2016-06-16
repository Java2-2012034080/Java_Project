package final_test_0616;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SubFrame extends Abstract_Sub implements ActionListener{
	
	private JButton button1, button2;
	private JLabel lab1;
	private JTextArea text;
	static int count = 0;
	static int command = 0;
	
	SubFrame(){
		
		JPanel panel = new JPanel();
		
		setSize(800,300);
		
		button1 = new JButton("String1: One command and make re_subFrame");
		button2 = new JButton("Strinf2: Two command");
		lab1 = new JLabel("subFrame and command");
		text = new JTextArea(20,40);
		
		setTitle("subfrma 1 :"+(++count));
		add(panel);
		panel.setLayout(new BorderLayout());
		
		JPanel panel2 = new JPanel();
		panel.add(panel2, BorderLayout.NORTH);
		panel2.add(button1);
		panel2.add(button2);
		
		JPanel panel3 = new JPanel();
		panel.add(panel3, BorderLayout.CENTER);
		panel3.add(lab1);
		//panel3.add(text);
		JScrollPane scrollpane = new JScrollPane(text);
		panel3.add(scrollpane);
		
		text.setEditable(false);
		
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1){
			++command;
			new SubFrame2();
			text.append("make String1: (frame count :"+SubFrame2.count+"), (command counter :"+command+")\n");}
			
		else if(e.getSource()==button2){
			++command;
			text.append("make String2: command count :"+command+"\n");}
		
	}
	

}
