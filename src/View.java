import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;


public class View extends Frame {
	
	String s;
	
	public View() {
		setTitle("View");
		setSize(300, 300);
		setLocation(400, 100);
		setLayout(new FlowLayout());
		setVisible(true);
	}
	
	void updateWert(String s) {
		this.s = s;
		repaint();
	}
	
	public void paint(Graphics g) {
		if (s == null) {
			s = "";
		}
		g.drawString(s, 100, 100);
	}

}
