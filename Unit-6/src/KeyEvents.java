import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyEvents extends JFrame implements KeyListener
{
          JButton b1,b2,b3,b4;
          public KeyEvents()
          {
        	  b1=new JButton("R");
        	  b2=new JButton("G");
        	  b3=new JButton("B");
        	  b4=new JButton("Y");
        	  setLayout(new FlowLayout());
        	  add(b1);
        	  add(b2);
        	  add(b3);
        	  add(b4);
              addKeyListener(this);
              setFocusable(true);
              setSize(500,500);
              setLocation(500,500);
              setResizable(false);
              setDefaultCloseOperation(EXIT_ON_CLOSE);
              setVisible(true);
          }
          public void keyPressed(KeyEvent ke)
          {
        	  if(ke.getKeyChar()=='R'){
        		  b1.setBackground(Color.RED);
        		  }
        	  else if(ke.getKeyChar()=='G')
        		  b2.setBackground(Color.GREEN);
        	  else if(ke.getKeyChar()=='B')
        		  b3.setBackground(Color.BLUE);
        	  else if(ke.getKeyChar()=='Y')
        		  b4.setBackground(Color.YELLOW);
          }
          public void keyReleased(KeyEvent ke){}
          public void keyTyped(KeyEvent ke){
        	 
          }
          public static void main(String args[])
          {
        	  KeyEvents ke=new KeyEvents();
          }
}
