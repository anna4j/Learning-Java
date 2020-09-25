class BaseClass 
{
	public int i;
	BaseClass()
	{
		i = 10;
	}
	BaseClass(int j)
	{
		i = j;
	}
	public void display()
	{
		System.out.println(i + " ");
	}
}

public class Inheritance extends BaseClass{

	public static void main(String[] args) 
	{
        Inheritance  obj = new Inheritance();
        
		obj.display();
        
        BaseClass obj1 = new BaseClass(20);
        
        obj1.display();
        
        BaseClass obj2 = new BaseClass();
		obj2.display();
	}

}