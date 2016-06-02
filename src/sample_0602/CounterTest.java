package sample_0602; //카운터 작성하기

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyCounter extends JFrame implements ActionListener{
	private JLabel label, label2;
	private JButton button;
	private int count =0;
	
	public MyCounter(){
		JPanel panel = new JPanel();
		label = new JLabel("Counter");
		panel.add(label);
		
		label2= new JLabel(" "+count);
		label2.setFont(new Font("serif", Font.BOLD | Font.ITALIC, 100));
		panel.add(label2);
		
		button = new JButton("카운터 증가");
		panel.add(button);
		button.addActionListener(this);
		
		add(panel);
		setSize(300,200);
		setTitle("으악");
		setVisible(true);
	}
	public void ActionPerformed(ActionEvent e){
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		count++;
		label2.setText(count + " ");
	}
}

public class CounterTest {

	public static void main(String[] args) {
		new MyCounter();

	}

}
