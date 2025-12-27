
class employee{
    String name;
    String age;

    public void printInfo (String name){
        System.out.println("name of the employee:"+name);

    }

    public void printInfo(String name , int age){
        System.out.println("Name of the Employee:"+name);
        System.out.println("Age of the Employee"+age);

    }

    public void printInfo(String name , int age , int number){
        System.out.println("Name of the employee is:"+name );
        System.out.println("Age of the Employee is:"+age);
        System.out.println("Number of the Employee is:"+number);

    }

    // this is method overloading which is also known as method overloading

}
public class Person {
    public static void main(String[] args) {
        employee myobj1=new employee();
        myobj1.printInfo("sonam");
        
        System.out.println();

        employee myobj2=new employee();
        myobj2.printInfo("Puffin",14);

        System.out.println();
        
        employee myobj3=new employee();
        myobj3.printInfo("Rahul",23,1);

        
    }

    
}



// Polymorphism : there are many ways to represents an single entity
// poly means many 
// Morphism means ways to represent 
// The langues which does not support polymorphism are know as object
//  basis languages and the  languages which support polymorphism are known as object oriented languages



/* 

=========================
Types of polymorphism
=========================
Compile time Polymorphism / Static Polymorphism: this is achieved by a method overloading
What is method overloading 
when a class has multiple methods with te same name as class name but have different number of parameters
Example multiple characters
Metal overloading is also known as compile-time polymorphism. 
 Why method overloading is known as compile-time polymorphism? 
 The reason is Java determines which constructor and method will be called at the time of compile time. 

 run Time polymorphism and Dynamic polymorphism
 Runtime polymorphism is achieved by method overriding

*/


/*
When a child class has the same method name as the super
class or parent class, and the parameters are the same, 
everything is the same but only the body is different, that 
is called method overriding. 
*/
