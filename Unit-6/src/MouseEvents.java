import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseEvents extends JFrame implements MouseListener
{
 JLabel txt;
 public MouseEvents()
 {
	 super("Window with MouseEvents");
	 setLayout(new FlowLayout());
	 txt=new JLabel();
	 txt.setFocusable(false);
	 add(txt);
	 addMouseListener(this);
	 setSize(500,500);
	 setLocation(500,500);
	 setResizable(false);
	 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 setVisible(true); 
 }
 public void mouseExited(MouseEvent me)
 {
	 
 }
 public void mouseReleased(MouseEvent me)
 {
 }
 public void mouseEntered(MouseEvent me)
 {
 }
 public void mousePressed(MouseEvent me)
 {
 }
 public void mouseClicked(MouseEvent me)
 {
	 txt.setText("Mouse Clicked At  "+me.getX()+","+me.getY());
	 txt.setFocusable(true);
 }
 public static void main(String args[])
 {
	 MouseEvents me=new MouseEvents();
 }
}
