class A{ 
    void show() 
    { 
        System.out.println("show() method for Base Class A"); 
    } 
} 
   
class B extends A{ 
    void show() 
    { 
        super.show(); 
        System.out.println("show() method for Child Class B"); 
    } 
} 
  

public class methodOverriding { 
    public static void main(String[] args) 
    { 
        A obj = new B();

        obj.show(); 
    } 
}