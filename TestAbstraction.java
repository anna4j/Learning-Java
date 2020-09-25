abstract class Shape{  
abstract void draw();  
}  

class Rectangle extends Shape{  
void draw(){
System.out.println("drawing rectangle");
}  
}  
class Circle1 extends Shape{  
void draw(){
System.out.println("drawing circle");
}  
}  

class TestAbstraction{  
public static void main(String args[]){  
Shape s=new Circle1();//object is provided through method, e.g., getShape() method  
s.draw();  
}  
}  