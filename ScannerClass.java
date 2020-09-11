// Java program to read data of various types using Scanner class. 
import java.util.Scanner; 
public class ScannerClass
{ 
	public static void main(String[] args) 
	{ 
		// Declare the object and initialize with 
		// predefined standard input object 
		Scanner sc = new Scanner(System.in); 
		
		 System.out.print("Enter an Interger value: ");
		// Integer input
		int a = sc.nextInt();

		System.out.print("Enter an Float value: ");
		// Float input
		float b = sc.nextFloat(); 

		System.out.print("Enter an Long value: ");
		// Long input
		long c = sc.nextLong(); 

		System.out.print("Enter an Double value: ");
		// Double Input
		double d = sc.nextDouble(); 	

		System.out.print("Enter a Character: ");
		// Character input 
		char ch = sc.next().charAt(0); 

		sc.nextLine();

		System.out.print("Enter a String: ");
		// String input 
		String str = sc.nextLine(); 
		System.out.print("\nOutput Obtained:\n");

		
		// Print the values to check if the input was correctly obtained. 
			
			
		System.out.println("Integer: "+a);
		System.out.println("Float: "+b);
		System.out.println("Long: "+c);
		System.out.println("Double: "+d);
		System.out.println("Character: "+ch); 
		System.out.println("String: "+str); 	
		
	 
		
	} 
} 
