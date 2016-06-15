package for_test_items;

import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pizza extends JFrame{
	
	private static final LayoutManager Borderlayout = null;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel back;
	private JButton but1, but2, but3;
	private JTextField text;
	
	
	Pizza(){
		JPanel back= new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		this.setSize(200, 300);
		
		this.add(back);
		back.setLayout(new BorderLayout());
		back.add(panel1, BorderLayout.NORTH);
		back.add(panel2, BorderLayout.CENTER);
		
		
		JTextField text = new JTextField();
		panel1.add(text);
		text.setText("후니 피자에 오실것을 환영합니다.!! 종류를 선택하세요.");
		
		JButton but1 = new JButton("불고기");
		JButton but2 = new JButton("콤비네이션");
		JButton but3 = new JButton("믹스");
		
		panel2.add(but1);
		panel2.add(but2);
		panel2.add(but3);
	
		
		setVisible(true);
		pack();
	}
	
	

}
