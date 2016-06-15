package for_test_items;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionEventExe extends JFrame implements ActionListener{

	private JPanel panel;
	private JButton but;
	private JLabel label;
	
	ActionEventExe(){
		
		panel = new JPanel();
		this.add(panel);
		panel.setLayout(new BorderLayout());
		
		this.setSize(1200, 300);
		
		but = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌러지지 않았죵");
		panel.setSize(1000, 200);
		panel.add(but, BorderLayout.NORTH);
		panel.add(label, BorderLayout.CENTER);
		
		but.addActionListener(new ActionListener(){
			public void ActionPerformed(ActionEvent e){
				
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==but)
					label.setText("마침내 버튼눌려졌거든?");
				
			}
			});
		
		this.setVisible(true);
		pack();

		
	
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	/*@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == but){
			label.setText("마침내 버튼이 눌러졌습니다.");
		}
		
	}*/
	

}
