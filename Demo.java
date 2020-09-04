public class Demo{
	public static int a = 100; // All instances of staticDemo have this variable as a common variable
	public int b =2 ;  //
	public static void showA(){
		System.out.println("A is"+a);
	}
	public void showB()
	{
	System.out.println("A is "+ a);
	System.out.println("B is "+ b);
	}
}

//here the functions did not have a return type hence void is written to specify the return type
//the keyword "class" starts with lowercase