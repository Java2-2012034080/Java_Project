package sample_0602;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyEvent extends JFrame implements KeyListener{
	
	private JPanel panel;
	private JTextField field;
	private JTextArea area;
	
	public KeyEvent(){
		panel = new JPanel(new GridLayout(0,2));
		panel.add(new JLabel("문자를 입력하시오: "));
		field = new JTextField(10);
		panel.add(field);
		area= new JTextArea(3,30);
		add(panel, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		
		field.addKeyListener(this);
		setTitle("keyEvent");
		setSize(400,200);
		setVisible(true);
		
		
	}
	
	public void keyTyped(KeyEvent e){
		
	}
	
	public void keyPressed(KeyEvent e){
		
	}
	
	public void keyReleased(KeyEvent e){
		
	}
	
	protected void display(java.awt.event.KeyEvent e, String s){
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		String modifiers = "Alt: " + e.isAltDown() + "Ctrl: " + e.isControlDown() + "shift: " +  e.isShiftDown();
		area.append(" " + s +"문자 "+ c + "(코드: "+keyCode + ")" + modifiers+"\n");
	}

	@Override
	public void keyPressed(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		display(e, "key Typed      ");
		
	}

	@Override
	public void keyReleased(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		display(e, "key Pressed    ");
	}

	@Override
	public void keyTyped(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		display(e, "key released ");
	}



}
