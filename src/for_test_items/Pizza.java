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
		text.setText("�Ĵ� ���ڿ� ���ǰ��� ȯ���մϴ�.!! ������ �����ϼ���.");
		
		JButton but1 = new JButton("�Ұ��");
		JButton but2 = new JButton("�޺���̼�");
		JButton but3 = new JButton("�ͽ�");
		
		panel2.add(but1);
		panel2.add(but2);
		panel2.add(but3);
	
		
		setVisible(true);
		pack();
	}
	
	

}
