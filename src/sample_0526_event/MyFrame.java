package sample_0526_event;

import javax.swing.*;
import java.awt.event.*;

public class MyFrame extends JFrame{
	private JButton button;
	private JLabel label;
	
	public MyFrame(){
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("test");
		
		JPanel p1 = new JPanel();
		
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("����~~~~~~~~~~~~~~~~~");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==button){
					label.setText("��ư�� ��������~~~~~~~!");
				}
			}
			});
		p1.add(button);
		p1.add(label);
		this.add(p1);
		this.setVisible(true);
			
	}
	



}