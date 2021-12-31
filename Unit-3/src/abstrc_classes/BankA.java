package abstrc_classes;
import abstract_classes.*;
public class BankA extends Bank {
	  int balance;
      public BankA()  
      {
        balance=100;
      }
      public void getBalance()
      {
    	  System.out.println("BALANCE IN BANKA:"+balance);
      }

}
