import java.io.*;
import java.awt.*;
import java.awt.event.*;

class MEvents extends Frame implements MouseListener,MouseMotionListener {
	TextField t;
	int x,y;
	public MEvents() {
		super("Mouse Demo");
		t = new TextField(20);
		setLayout(new FlowLayout());
		add(t);
		setSize(600,600);
		setVisible(true);
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new WindowAdapter() 
                            {
			         public void windowClosing(WindowEvent we)
				 {
			            System.exit(0);
         			 }        
			      });
	}
	public void paint(Graphics g) {
		g.drawString("(" + x + "," + y + ")" ,x,y);
	}
	public void mousePressed(MouseEvent me) {
		t.setText("Mouse Pressed " + me.getX() + "," + me.getY());
		x = me.getX();
		y = me.getY();
		repaint();
	}
	public void mouseReleased(MouseEvent me) {
		t.setText("Mouse Released" + me.getX() + "," + me.getY());
		x = me.getX();
		y = me.getY();
		repaint();
	}
	public void mouseClicked(MouseEvent me) {
		t.setText("Mouse Clicked" + me.getX() + "," + me.getY());
		x = me.getX();
		y = me.getY();
		repaint();
	}
	public void mouseEntered(MouseEvent me) {
		t.setText("Mouse Entered");
	}
	public void mouseExited(MouseEvent me) {
		t.setText("Mouse Exited");
	}
	public void mouseMoved(MouseEvent me) {
		t.setText("Mouse Moved" + me.getX() + "," + me.getY());
		x = me.getX();
		y = me.getY();
		repaint();
	}
	public void mouseDragged(MouseEvent me) {
		t.setText("Mouse Dragged" + me.getX() + "," + me.getY());
		x = me.getX();
		y = me.getY();
		repaint();
	}
}
class MMouse {
	public static void main(String args[]) {
		MEvents obj = new MEvents();
	}
}