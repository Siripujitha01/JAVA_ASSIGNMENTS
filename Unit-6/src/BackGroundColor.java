import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BackGroundColor  extends JFrame implements MouseListener
{
	 public BackGroundColor()
	 {
		 super("Window with MouseEvents");
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
		 getContentPane().setBackground(Color.green);
	 }
	 public static void main(String args[])
	 {
		 BackGroundColor me=new BackGroundColor();
	 }
	}