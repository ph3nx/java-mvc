import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;


public class Control extends Frame implements ActionListener {
	
	Button b; TextField t; Model m;
	
	public Control(Model m) {
		this.m = m;
		setTitle("Control");
		setSize(300, 300);
		setLocation(400, 100);
		setLayout(new FlowLayout());
		
		b = new Button("go");
		t = new TextField(10);
		add(b);
		add(t);
		
		b.addActionListener(this);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = t.getText();
		m.schreibeGross(s);
	}

}
