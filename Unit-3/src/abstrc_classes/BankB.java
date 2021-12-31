package abstrc_classes;
import abstract_classes.*;
public class BankB extends Bank{
	int balance;
    public BankB()  
    {
      balance=150;
    }
    public void getBalance()
    {
  	  System.out.println("BALANCE IN BANKB:"+balance);
    }

}
