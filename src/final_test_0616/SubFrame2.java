package final_test_0616;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SubFrame2 extends Abstract_Sub implements ActionListener {
	
	private JRadioButton first, second, third;
    private JLabel lab;
    private JPanel backpanel, panel1, panel2;
    
    static int count=0;
    
    SubFrame2(){
    	setSize(300,100);
    	setTitle("SubFrame 2: "+ ++count);
    	
    	backpanel = new JPanel();
    	backpanel.setLayout(new BorderLayout());
    	add(backpanel);
    	
    	
    	first = new JRadioButton("First");
    	second = new JRadioButton("second");
    	third = new JRadioButton("third");
    	ButtonGroup num = new ButtonGroup();
    	num.add(first);
    	num.add(second);
    	num.add(third);
    	first.addActionListener(this);
    	second.addActionListener(this);
    	third.addActionListener(this);
    	
    	panel1 = new JPanel();
    	panel1.setLayout(new GridLayout(0,3));
    	backpanel.add(panel1, BorderLayout.NORTH);
    	panel1.add(first);
    	panel1.add(second);
    	panel1.add(third);
    	
    	panel2 = new JPanel();
    	backpanel.add(panel2, BorderLayout.CENTER);
    	lab = new JLabel("Select Radio Button");
    	panel2.add(lab);
    	
    	
    	setVisible(true);
    	
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == first) {
			++SubFrame.command;
            lab.setText("Select Button 1, command counter :"+SubFrame.command);}
		if (e.getSource() == second) {
			++SubFrame.command;
            lab.setText("Select Button 2, command counter :"+SubFrame.command);}
		if (e.getSource() == third) {
			++SubFrame.command;
            lab.setText("Select Button 3, command counter :"+SubFrame.command);}
		
	}

}
