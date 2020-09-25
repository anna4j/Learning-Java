final class Final 
{
	public void display()
	{
		System.out.println("Final Class is implemented");
	}
}


class Base 
{
	void func()
{
		System.out.println("Demo is implemented");
}
	
}
public class implementFinal 
{

	public static void main(String[] args) {
		Final f = new Final();
		f.display();
		Base b = new Base();
		b.func();
	}

}