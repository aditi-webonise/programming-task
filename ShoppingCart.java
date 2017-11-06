import java.util.Scanner;
class ShoppingCart{
	public static int colgate_price= 10;
	public static int closeup_price= 15;
	public static int no_of_colgate= 0;
	public static int no_of_closeup= 0;
	public static int total_colgate;
	public static int total_closeup;
	public static int sum=0;
	public static String colgate, closeup; 
	public static void main(String args[])
	{	
		System.out.println("Welcome!! We have two products Colgate and Close Up");
		System.out.println("Price of Colgate is "+ colgate_price);
		System.out.println("Price of Close Up is "+ closeup_price);
		while(true)
		{
			System.out.println("Do you want to continue Shopping?");
			Scanner scanner = new Scanner(System.in);
			String shop = scanner.nextLine();
			if (shop.equals("y"))
			{	System.out.println("Enter your choice\n 1. Add Colgate to your cart\n 2. Add Close Up to your cart\n 3. Remove Colgate from your cart\n 4. Remove Close Up from your cart");
				Scanner scannera = new Scanner(System.in);
				int option = scannera.nextInt();	
				
				switch(option){
	 
					case 1:addColgate();
					break;
					case 2:addCloseup();
					break;
					case 3:removeColgate();
					break;
					case 4:removeCloseup();
					default: break;
				}				
			}
			else{
				System.out.println("Do you want to use the available offer :BUY 2 GET 1 FREE");
					Scanner scanner5 = new Scanner(System.in);
					String offer = scanner5.nextLine();
					if(offer.equals("y"))
					{
						total_colgate= offer(no_of_colgate);
											
					}
					else
					{
						total_colgate= no_of_colgate * colgate_price;
						
					}
					total_closeup = no_of_closeup * closeup_price;
					sum= total_colgate + total_closeup ;
					System.out.println("Total amount to be paid is "+sum);
					System.out.println("Thanks for visiting!!");
					break;
			   }
    									
		}
		
	}
	static int offer(int no_of_colgate)
	{
		int free = no_of_colgate/3;
		int usual = no_of_colgate % 3;
		return free * 20 + usual * 10;
	}
	static void addColgate()
	{
			System.out.println("Enter the number of Colgate");
			Scanner in = new Scanner(System.in);
			no_of_colgate = no_of_colgate + in.nextInt();
        }
	static void addCloseup()
	{
		
		System.out.println("Enter the number of Close Up");
		Scanner in = new Scanner(System.in);
		no_of_closeup = no_of_closeup + in.nextInt();
		
	}
	static void removeColgate()
	{
		
		System.out.println("Enter the number of Colgate");
		Scanner in = new Scanner(System.in);
		no_of_colgate = no_of_colgate - in.nextInt();
		
	}
	static void removeCloseup()
	{
		
		System.out.println("Enter the number of Close Up");
		Scanner in = new Scanner(System.in);
		no_of_closeup = no_of_closeup - in.nextInt();
		
	}
	
}

