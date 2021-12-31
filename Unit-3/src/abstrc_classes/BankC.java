package abstrc_classes;
import abstract_classes.*;
public class BankC extends Bank {
	int balance;
    public BankC()  
    {
      balance=200;
    }
    public void getBalance()
    {
  	  System.out.println("BALANCE IN BANKC:"+balance);
    }

}
