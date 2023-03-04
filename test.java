import java.util.Scanner;
class Book 
{
	String title ;
	double price;
	
	
	Book (String title , double price )
	{
		this.title = title;
		this.price = price;
		
	}
	
	double purchaseOrder(int quantity)
		{
			double total = quantity * price;
			return total; 
		
		}
	

}

class test 
{
	public static void main (String args [])
	{
		
		Scanner sc = new Scanner (System.in);

		String title ;
		double price ;
		int quantity;
		
	
		System.out.println ("\t\tFor book 1"); 
		System.out.print ("Name of book :\t"); 
		title = sc.nextLine();
		
		System.out.print ("Price of book :\t"); 
		price = sc.nextDouble();
		Book b1 = new Book (title,price);
		
		
		System.out.print ("Quantity :\t"); 
		quantity = sc.nextInt();
		
		
		System.out.println (" name : "+title);
		System.out.println (" purchase : "+price );
		System.out.println (" Quantity : " +quantity);
		System.out.print ("Total purchasing price :\t"+b1.purchaseOrder ( quantity ));

		

		
		
		System.out.println ("\t\tFor book 2"); 
		
		System.out.print ("Name of book :\t"); 
		title = sc.nextLine();
		
		System.out.print ("Price of book :\t"); 
		price = sc.nextDouble();
		Book b2= new Book (title,price);
		
		
		System.out.print ("Quantity :\t"); 
		quantity = sc.nextInt();
		
	
		System.out.println (" name : "+title);
		System.out.println (" purchase : "+price);
		System.out.println (" Quantity : "+ quantity);
		System.out.print ("Total purchasing price :\t"+b2.purchaseOrder ( quantity ));

		
		
		}

}
	
	
		
		