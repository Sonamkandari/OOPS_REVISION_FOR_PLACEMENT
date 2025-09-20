class Pen{
    String Color;
    String type;

    public void printDetails(){
        System.out.println("Color of pen is:"+Color);
        System.out.println("Type of pen is:"+type);
    }
}

class Student{
    String name ;
    int  Roll_no;
    String city;

    public void printStudentDetails(){
        System.out.println("Name of the Student is:"+name);
        System.out.println("Roll number of the student is:"+Roll_no);
        System.out.println("City of the student is:"+city);
    }
}
public class oops {
    public static void main(String[] args) {
        Pen myobj=new Pen();
        myobj.printDetails();

        Student myobj1=new Student();
        System.err.println();
        myobj1.printStudentDetails();
    }
    
}
