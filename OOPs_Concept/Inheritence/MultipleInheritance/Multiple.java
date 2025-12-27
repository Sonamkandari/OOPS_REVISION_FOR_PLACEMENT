//Note, Multiple Inheritance is not supported by Java 
// and since it is not supported by Java, therefore we
//  use a concept called Interfaces to support multiple inheritance. 

//For example, there are two classes A and B.
// Both classes have the same variable. Now, 
// a third class C is extending both parent classes.
// The child class C will get confused from which 
// parent class it is asking and calling because
// both have the same variables or parameters. 
class Shape{
    public void area1(){
        System.out.println("Display area");
    }
}

class Triangle extends Shape{
     public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
   
}
public class Multiple {
    public static void main(String[] args) {
        Triangle myobj=new Triangle();
        myobj.area1();
        myobj.area(12,15);

        System.out.println();

        Circle myobj1=new Circle();
        myobj.area1();
        myobj1.area(23);

        
    }
    
}


// it is not possible in java but can be implemented using interfaces
// Multiple inInheritance is when one class is extending more then one classes that is called multiple inheritance
// But java does not support multiple inheritance 
// why java does not supported multiple inheritance as due to ambiguity
// As two or more parent classes has the same variable,same property the child class get confused with  which one to pick

// but in java there might be some cases where you need to use the properties of multiple classes so then how we will do that

// then we will do it by using something called interfaces
// 