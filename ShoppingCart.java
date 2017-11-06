class ShoppingCart{
	public static int colgate_price= 10;
	public static int closeup_price= 15;
	public static int no_of_colgate;
	public static int total_price;
	public static void main(String args[])
	{
		System.out.println("Price of Colgate is "+ colgate_price);
		System.out.println("Price of Close Up is "+ closeup_price);
		ShoppingCart cart = new ShoppingCart();		
		cart.case1(1);
		cart.case1(10);
		cart.case3(5,2);

	}
	void case1(int no_of_colgate)
	{ 
		total_price= no_of_colgate * colgate_price;
		printBill(no_of_colgate, total_price);
			
	}
	void case3(int no_of_colgate, int no_of_closeup)
	{
		total_price= no_of_colgate * colgate_price + no_of_closeup * closeup_price;
		printBill(no_of_colgate, no_of_closeup, total_price);
	}
	
	void printBill(int no_of_colgate, int total_price)
	{
		System.out.println("No. of colgate is "+ no_of_colgate);
		System.out.println("Total price is "+ total_price);
	}
	void printBill(int no_of_colgate,int no_of_closeup, int total_price)
	{
		
		System.out.println("No. of Colgate is "+ no_of_colgate);
		System.out.println("No. of Close Up is "+ no_of_closeup);
		System.out.println("Total price is "+ total_price);
	}
}
