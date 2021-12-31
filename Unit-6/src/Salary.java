import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Salary extends JFrame implements ActionListener
{
     JButton b1,b2,b3;
     JLabel l1,l2,l3,l4,l5;
     JTextField t1,t2,t3,t4;
     JRadioButton r1,r2,r3,r4;
     public Salary()
     {
    	 super("TechWellPublicSchool");
    	 b1=new JButton("CALCULATE");
    	 b2=new JButton("CLEAR");
    	 b3=new JButton("EXIT");
         l1=new JLabel("Basic Salary");
         l2=new JLabel("Gross Salary");
         l3=new JLabel("Deductions");
         l4=new JLabel("Net Salary");
         l5=new JLabel("Employee Category");
         t1=new JTextField(5);
         t2=new JTextField(5);
         t3=new JTextField(5);
         t4=new JTextField(5);
         r1=new JRadioButton("Non Teaching");
         r2=new JRadioButton("PGT");
         r3=new JRadioButton("TGT");
         r4=new JRadioButton("PRT");
         setLayout(new FlowLayout());
         JButtonGroup bg=new JButtonGroup();
     }
}
