import java.util.Scanner;
class ShoppingCart{
	public static int colgate_price= 10;
	public static int closeup_price= 15;
	public static int no_of_colgate;
	public static int no_of_closeup;
	public static int grand_total;
	public static int total_price;
	public static void main(String args[])
	{
		System.out.println("Price of Colgate is "+ colgate_price);
		System.out.println("Price of Close Up is "+ closeup_price);
		ShoppingCart cart = new ShoppingCart();		
		cart.case12(1);
		cart.case12(10);
		cart.case3(5,2);
		cart.case4();
		cart.case5();

	}
	void case12(int no_of_colgate)
	{ 
		total_price= no_of_colgate * colgate_price;
		printBill(no_of_colgate, total_price);
			
	}
	void case3(int no_of_colgate, int no_of_closeup)
	{
		grand_total= no_of_colgate * colgate_price + no_of_closeup * closeup_price;
		printBill(no_of_colgate, no_of_closeup, grand_total);
	}
	void case4()
	{	
		System.out.println("Enter the number of Colgate");
		Scanner in = new Scanner(System.in);
		no_of_colgate = in.nextInt();
		int free = no_of_colgate/3;
		int usual = no_of_colgate % 3;
		total_price= free * 20 + usual * 10;
		printBill(no_of_colgate, total_price);
                 
	}
	void  case5()
	{
		case4();
		System.out.println("Enter the number of Close Up");
		Scanner in = new Scanner(System.in);
		no_of_closeup = in.nextInt();
		int grand_total= total_price + no_of_closeup * closeup_price;
		printBill(no_of_colgate, no_of_closeup, grand_total);

	}

	void printBill(int no_of_colgate, int total_price)
	{
		System.out.println("No. of colgate is "+ no_of_colgate);
		System.out.println("Total price of Colgate is "+ total_price);
	}
	void printBill(int no_of_colgate,int no_of_closeup, int grand_total)
	{
		
		System.out.println("No. of Colgate is "+ no_of_colgate);
		System.out.println("No. of Close Up is "+ no_of_closeup);
		System.out.println("Total price of Colgate and Close Up is "+ grand_total);
	}
	
}
