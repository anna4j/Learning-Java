public class Demotry{
	public static void main(String args[]){
		Demo.a = 35; // when we use the class name, the class is loaded, direct access to "a" without any instance
		//Demo.b=22; // ERROR this is not valid for non static variable
		Demo d = new Demo(); 
		d.b = 200;  // valid to set a value for a non static variable after creating an instance.
		Demo.showA();  //prints 35
	}
}