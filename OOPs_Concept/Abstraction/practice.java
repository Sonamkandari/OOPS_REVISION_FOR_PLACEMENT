abstract class Animal{
    // used a abstract key word
    //we can create it but we does not create object of a abstract class
    // also we can create abstract functions inside a abstract class

    abstract void walk();
    // implementation of abstract function is not required or we can say 
    //abstract functions are not implemented
    abstract void meow();

    public void eat(){
        System.out.println("animals Eat the Grass");
    }


    // creating a constructor of Animal class
    Animal(){
        System.out.println("Created a Animal  Constructor");
    }

    
}
// note since horse , dog and cat are already having the properties of animal class 
// so here in this case it is not required for a student to access the methods of animal class
//
class Horse extends Animal{

      // Creating a constructor of Horse class
      Horse (){
        System.out.println("Created a Horse");

      }
    public void walk(){
        System.out.println("walk on 4 legs");
    }

    public void meow(){
        System.out.println("A horse can not do Meow");
    }

  

}
class Dog extends Animal{

    // Creating a Constructor of a Dog class
    Dog(){
        System.out.println("Creating a constructor of a Horse");
    }
    public void walk(){
        System.out.println("walt with 2+2 legs");
    }

    public void meow(){
        System.out.println("The dog cannot do Meow");
    }
}
class cat extends Animal{
    public void meow(){
        System.out.println("What Does a cat do --> MEOW MEOW MEOW");
    }
    public void walk(){
        System.out.println("Cat walk with 4 paws");
    }
}
//It is define as the  hiding unnecessarily details 
public class practice {
    public static void main(String[] args) {
        //creating the objects of Horse class
        Horse horse=new Horse();
        // when ever we create a object of the particular class the constructor get called automatically
        //Requirement of constructor it ensure that objects are properly initialized with desired or default values 
        //Constructors are automatically called when an object is created, so you don't need to separately call initialization methods.
        horse.walk();
        horse.meow();
        horse.eat();

        //note what is constructor chaining when we call the object of derived class and the object firstly call the function of base class and then call the constructor of sub class is called a constructor chaining

        System.out.println();
        Dog mydog=new Dog();
        mydog.walk();
        mydog.meow();
        mydog.eat();



        //Note an Animal is an Abstract class and we cannot instantiated a Animal class
        // Animal animal=new Animal();
        // animal.walk();
        
    }
    
}
