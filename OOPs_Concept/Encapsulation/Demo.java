package Encapsulation;
//when we are putting data abd functions inside a class this called encapsulation in java
//creating classes and objects are called Encapsulation in java
// with the help of Encapsulation we can do data hiding in java for example if we want to hide the some specific details from a specific user so there we can use data hiding
// data hiding we implimented  using access modifier
/*SOLID is the basic principle of software engineering. 
 Here S stand for SRP principle. 
 S- single responsibility principle : SRP's principle states that one class will do only one work, and one method will do only a single work. SRP principle maintains the code readability. 
 O-
 L-
 I-
 D-
 */  



/*

Encapsulation:It refers to the wrapping the implementation of data members and
the members inside the class. 


 */

public class Demo {
    public static void main(String[]args){
        // new Employee this new keyword is used here to create an object
        Employee sonam=new Employee(); // created object sonam with reference to Employee class
        System.out.println(sonam.id);
        System.out.println(sonam.name);
        System.out.println(sonam.salary);
        
    }
    
}
