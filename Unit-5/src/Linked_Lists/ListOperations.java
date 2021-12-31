package Linked_Lists;
import java.util.*;
public class ListOperations {
       	  Scanner sc=new Scanner(System.in);
       	LinkedList<Integer> ll = new LinkedList<Integer>();
          public void menu()
          {
        	  int ch;
        	  do
        	  {
        	  System.out.println("SELECT ONE OPTION:");
        	  System.out.println("1.INSERT\n2.REMOVE\n3.GET\n4.EXIT:");
        	  ch=sc.nextInt();
        	  switch(ch)
        	  {
        	  case 1:
        		  insert();
        		  break;
        	  case 2:
        		  remove();
        		  break;
        	  case 3:
        		  get();
        		  break;
        	  case 4:
        		  System.out.println("...........EXIT............");
        		  break;
        	  default:
        			 System.out.println("ENTER VALID OPTION"); 
        	  }
        	  }while(ch != 4);
          }
          public void insert()    
          {
        	   int ch;
        	  System.out.println("SELECT ONE\n1.ADD FIRST\n2.ADD LAST");
        	  ch=sc.nextInt();
        	  if(ch==1)
        	  {
        		  System.out.println("ENTER OBJECT:");
        		  ll.addFirst(new Integer(sc.nextInt()));
        	  }
        	  else
        	  {
        		  System.out.println("ENTER OBJECT:");
    		      ll.addLast(new Integer(sc.nextInt()));
        	  }
          }
          public void remove()
          {
        	  int ch;
        	  System.out.println("SELECT ONE\n1.REMOVE FIRST\n2.REMOVE LAST");
        	  ch=sc.nextInt();
        	  if(ch==1)
        	  {
         		 System.out.println("REMOVED ELEMENT AT FIRST IS:"+ll.removeFirst()); 
        	  }
        	  else
        	  {
          		 System.out.println("REMOVED ELEMENT AT LAST IS:"+ll.removeLast()); 
        	  }
          }
          public void get()
          {
        	  int ch;
        	  System.out.println("SELECT ONE\n1.GET FIRST\n2.GET LAST");
        	  ch=sc.nextInt();
        	  if(ch==1)
        	  {
        		 System.out.println("ELEMENT AT FIRST IS:"+ll.getFirst()); 
        	  }
        	  else
        	  {
         		 System.out.println("ELEMENT AT LAST IS:"+ll.getLast()); 
        	  }
          }
}
