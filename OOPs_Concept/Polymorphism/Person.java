
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
