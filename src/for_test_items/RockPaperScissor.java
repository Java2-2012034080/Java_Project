package for_test_items;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RockPaperScissor extends JFrame implements ActionListener{

	private JPanel panel;
	private JButton but1, but2, but3;
	private JLabel label1, label2;
	

	RockPaperScissor(){
		
		setSize(400,300);
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		this.add(panel);
		
		label1 = new JLabel("æ∆∑°¿« πˆ∆∞ ¡ﬂø°º≠ «œ≥™∏¶ ≈¨∏≥«œΩ√ø‰");
		label2 = new JLabel("   ");
		
		panel.add(label1, BorderLayout.NORTH);
		panel.add(label2, BorderLayout.SOUTH);
		
		but1 = new JButton("Rock");
		but2 = new JButton("Paper");
		but3 = new JButton("Scissor");
		
		panel.add(but1, BorderLayout.WEST);
		panel.add(but2, BorderLayout.CENTER);
		panel.add(but3, BorderLayout.EAST);
		
		but1.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
		
		pack();
		
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==but1){
			Random rand = new Random();
			int count = rand.nextInt(3);
			
			if(count==0)
				label2.setText("∫Ò∞Â¿æ");
			else if(count==1)
				label2.setText("¡≥¿Ω");
			else
				label2.setText("¿Ã∞Â¿æ");
		}
		else if(e.getSource()==but2){
			Random rand = new Random();
			int count = rand.nextInt(3);
			
			if(count==0)
				label2.setText("¿Ã∞Â¿æ");
			else if(count==1)
				label2.setText("∫Ò∞Â¿Ω");
			else
				label2.setText("¡≥¿æ");
		}
		
		else if(e.getSource()==but3){
			Random rand = new Random();
			int count = rand.nextInt(3);
			
			if(count==0)
				label2.setText("¡≥¿æ");
			else if(count==1)
				label2.setText("¿Ã∞Â¿Ω");
			else
				label2.setText("∫Ò∞Â¿æ");
			
		}
			
	}
	

}
