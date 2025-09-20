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
        Student myobj1=new Student();
        myobj1.name="sonam";
        myobj1.Roll_no=1;
        myobj1.city="Dehradun";
        myobj1.printStudentDetails();

         

    }
    
}
