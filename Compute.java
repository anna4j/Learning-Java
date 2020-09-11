import java.util.Scanner;
public class Compute {

	public static void main(String[] args) {
		int a, b, c, x, y, z;

		
		Scanner s=new Scanner(System.in);

		System.out.print("Enter a: ");
		a=s.nextInt();
		
		System.out.print("Enter b: ");
		b=s.nextInt();

		System.out.print("Enter c: ");
		c=s.nextInt();

		System.out.print("Enter x: ");
		x=s.nextInt();
		
		System.out.print("Enter y: ");
		y=s.nextInt();

		System.out.print("Enter z: ");
		z=s.nextInt();

		
		double val1, val2;
		val1=(a/(float)c)*(float)z/a;
		val2=(c++)+(float)b/(float)x-y;

		System.out.println("Value of (a/c)z/a is: "+val1);
		System.out.println("Value of c++ +b/x-y is: "+val2);
	
	}

}