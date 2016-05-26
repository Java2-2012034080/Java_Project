package sample_0526_event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame_inner extends JFrame{
	private JButton button;
	private JLabel label;
	
	public MyFrame_inner(){
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("test");
		
		JPanel p1 = new JPanel();
		
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직~~~~~~~~~~~~~~~~~");
		button.addActionListener(new MyListener());
		p1.add(button);
		p1.add(label);
		this.add(p1);
		this.setVisible(true);

		
	}
	
	private class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==button){
				label.setText("마침내 버튼이 눌러졌습니다.");
			}
		}
	}
}
