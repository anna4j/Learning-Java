class MyClass
{
	MyClass display1(MyClass obj)
	{
		return obj;
	}
	public void display2()
	{
		System.out.println("Display-2 function is called");
	}
}

public class PassObject {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
        
        MyClass newObj = obj.display1(obj);
        
        newObj.display2();
	}

}