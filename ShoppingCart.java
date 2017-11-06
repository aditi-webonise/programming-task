import java.util.Scanner;
class ShoppingCart
{
	public static int colgatePrice= 10;
	public static int closeupPrice= 15;
	public static int noOfColgate= 0;
	public static int noOfCloseup= 0;
	public static int totalColgate;
	public static int totalCloseup;
	public static int sum=0;
	public static String colgate, closeup;
	static int offer(int noOfColgate){
		int free = noOfColgate/3;
		int usual = noOfColgate % 3;
		return free * 20 + usual * 10;
	}
	static void addColgate(){
			System.out.println("Enter the number of Colgate");
			Scanner in = new Scanner(System.in);
			noOfColgate = noOfColgate + in.nextInt(); 
    }
	static void addCloseup(){
		System.out.println("Enter the number of Close Up");
		Scanner in = new Scanner(System.in);
		noOfCloseup = noOfCloseup + in.nextInt();
		
	}
	static void removeColgate(){
		System.out.println("Enter the number of Colgate");
		Scanner in = new Scanner(System.in);
		noOfColgate = noOfColgate - in.nextInt();
		
	}
	static void removeCloseup(){
		System.out.println("Enter the number of Close Up");
		Scanner in = new Scanner(System.in);
		noOfCloseup = noOfCloseup - in.nextInt();
		
	} 
	public static void main(String args[])
	{	
		System.out.println("Welcome!! We have two products Colgate and Close Up");
		System.out.println("Price of Colgate is "+ colgatePrice);
		System.out.println("Price of Close Up is "+ closeupPrice);
		while(true){
			System.out.println("Do you want to continue Shopping?");
			Scanner scanner = new Scanner(System.in);
			String shop = scanner.nextLine();
			if (shop.equals("y")){	
				System.out.println("Enter your choice\n 1. Add Colgate to your cart\n 2. Add Close Up to your cart\n 3. Remove Colgate from your cart\n 4. Remove Close Up from your cart");
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
			}else{
				System.out.println("Do you want to use the available offer :BUY 2 GET 1 FREE");
					Scanner scanner5 = new Scanner(System.in);
					String offer = scanner5.nextLine();
					if(offer.equals("y")){
						totalColgate= offer(noOfColgate);
					}else{
						totalColgate= noOfColgate * colgatePrice;	
					}
					totalCloseup = noOfCloseup * closeupPrice;
					sum= totalColgate + totalCloseup ;
					System.out.println("Total amount to be paid is "+sum);
					System.out.println("Thanks for visiting!!");
					break;
			   }
    	}
		
	}
	
	
}

