package bank_pack;



import java.util.Scanner;
class BANK_OPERATIONS
{    Scanner in = new Scanner(System.in);
    
	double balance=100.00,getamt=0.0;

	
	 String name, bnkname ,date;
     
     int pincode;   
       
     
	void check_bal()
	{
		System.out.println("YOUR CURRENT BALANCE IS :"+balance);
	}
	
	void deposit()
	{
		System.out.println("  YOUR CURRENT BALANCE IS :"+balance);
	   	 System.out.print("  ENTER YOUR AMOUNT TO DEPOSIT :");
	   	 getamt=in.nextFloat();
      if(getamt>0)
      {
    	  balance +=getamt;
    	  System.out.println("YOUR AMOUNT SUCESSFULLY DEPOSITED");
      }
      else 
      {
    	  System.out.println("YOUR AMOUNT IS NOT DEPOSITED");
    	  System.exit(0);
      }
      
   	 
   	 
	}
	//bank account balance withdraw amount
	
	void withdraw()
	{
		System.out.println("  YOUR CURRENT BALANCE IS :"+balance);
	   	 System.out.print("  ENTER YOUR AMOUNT TO WITHDRAW :");
	   	 getamt=in.nextFloat();
      if(balance>100)
      {
    	  balance -=getamt;
    	  System.out.println("YOUR AMOUNT SUCESSFULLY WITHDRAWL");
      }
      else 
      {
    	  System.out.println("YOUR AMOUNT IS NOT WITHDRAWL BANK MAINTAIN SOME AMOUNT");
    	 // System.exit(0);
      }
   	 
	}
	
	void info()
	{
		System.out.println("\nMY NAME IS :"+name);
		System.out.println("\nMY BANK NAME IS :"+bnkname);
		System.out.println("\nMY BANK PIN CODE IS :"+pincode);
		System.out.println("\n"+name+" YOUR CURRENT BALANCE IS :"+balance);
		System.out.println("");
		System.exit(0);
	}
}

class BANK
{  

		public static void main(String[] args)
		{
			int choice;
			
		        BANK_OPERATIONS obj=new BANK_OPERATIONS();    
		        Scanner in = new Scanner(System.in);
		       
		            System.out.println("\t WELCOME TO OUR BANK");

		            System.out.print("ENTER YOUR NAME:");
		            obj.name = in.nextLine();
		            
		           

		            System.out.print(obj.name+"  ENTER YOUR Bank NAME:");
		            obj.bnkname = in.nextLine();

		            System.out.print(obj.name+" YOUR Bank PIN CODE:");
		            obj.pincode = in.nextInt();
		    		  
		        do {
		            System.out.print("\n \n \nWHAT DO YOU WANT TO DO\n");
		            System.out.println("*****************************");
		            System.out.println("\n1. CHECK BANK BALANCE");
		            System.out.println("\n2. DEPOSIT BANK ");
		            System.out.println("\n3. WITHDRAW BANK BALANCE");
		            System.out.println("\n4. I WANT TO GET MY INFORMATIONS");
		            System.out.println("\n5. PRESS 4 TO EXIT TO THE BANK");
		            System.out.println("\n Enter your choice : ");
		            choice=in.nextInt();
		            
     switch(choice)
     {
     case 1:
     {
    	obj.check_bal();
    	break;
     }
     case 2:
     {
    	 obj.deposit();
    	 break;
    	 
     }
     case 3:
     {
    	obj.withdraw();
    	 break;
    	 
     }
     case 4:
     {
    	obj.info();
    	 break;
    	 
     }
     
     default:
     {
    	 System.out.println(obj.name+"  YOUR CHOICE IS WRONG ");
    	 System.out.println("\nBYE BYE BYE");
    	 break;
     }
     }
}while(choice!=5);
		        in.close();
}
}



