package for_test_items;

import java.awt.BorderLayout;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyEvent extends JFrame implements KeyListener{
	
	
	private JPanel panel;
	private JTextField text;
	private JTextArea area;
	
	KeyEvent(){
		
		setSize(400,300);
		panel = new JPanel();
		add(panel);
		panel.setLayout(new BorderLayout());
		text = new JTextField();
		text.addKeyListener(this);
		panel.add(text, BorderLayout.NORTH);
		area = new JTextArea();
		JScrollPane s = new JScrollPane(area);
		area.setEditable(false);
		panel.add(s, BorderLayout.CENTER);
		
		setVisible(true);
	}

	@Override
	public void keyPressed(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		char c = e.getKeyChar();
		area.append(""+c);
	}

}
