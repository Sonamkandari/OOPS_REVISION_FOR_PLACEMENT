class Pen{
    String Color;
    String type;

    // public void printDetails(){
    //     System.out.println("Color of pen is:"+Color);
    //     System.out.println("Type of pen is:"+type);
    // }

    public void printDetails(){
        System.out.println(this.Color);
        System.out.println(this.type);

    }
}

class Student{
    String name ;
    int  Roll_no;
    String city;

    public void printStudentDetails(){
        // System.out.println("Name of the Student is:"+name);
        // System.out.println("Roll number of the student is:"+Roll_no);
        // System.out.println("City of the student is:"+city);

        //In place of above print statements we can use  this key word
       System.out.println(this.name);
       System.out.println(this.city);
       System.out.println(this.Roll_no);
    }

    // creating  constructor  for student class
    Student(){
        System.out.println("Constructor is called for the student class");
    }

    //creating a parameterized constructor
    Student(String name){
        this.name="sonam";
        this.Roll_no=123;

    }

    //creating a copy constructor
    Student(Student s2){
        this.name=s2.name;
        this.city=s2.city;
        this.Roll_no=s2.Roll_no;
    }
}
public class oops {
    public static void main(String[] args) {
        Pen myobj=new Pen();
        myobj.Color="red";
        myobj.type="Gel";

        myobj.printDetails();
        System.err.println();

        Pen myobj2=new Pen();
        myobj2.Color="yellow";
        myobj2.type="Ball";
        myobj2.printDetails(); // using this key word so that it can determine that which object is calling the particular function
         
        System.out.println();
        // whenever we created this object we will call the student constructor first
        Student s1=new Student();
        s1.name="sonam";
        s1.Roll_no=1;
        s1.city="Dehradun";
        s1.printStudentDetails();

        System.out.println();

        //we had not define properties for s2 ever but we used copy constructor for copying the values of s1 into s2
        Student s2=new Student(s1);
        s2.printStudentDetails();   

    }
    
}
