 public class Teacher {
    //properties which should be present inside the class properties and attributes
    private String name;
     String Dept;
     String subject;
    private double salary;

    //in C++ methods are also called member functions
    // methods  which should be present inside a class these methods will be related to the teacher class
    // this function is helping to change the old department value to a new department value 
    void changeDepartment(String newDepartment){
        //assigning a new value to the Department
        Dept=newDepartment;

    }

    //for printing the all the details together we can create a function
    void printDetails(){
        System.out.println("Name of the teacher:"+name);
        System.out.println("subject of the teacher:"+subject);
        System.out.println("Department  of teacher:"+Dept);
        System.out.println("Salary of the teacher:"+salary);
    }

    //I can create an another function
    void changeName(String NewName){
        name=NewName;
    }

    public static void main(String[] args) {
        //Assigning values to t1
        Teacher myobj1=new Teacher();
        myobj1.Dept="Engineer";
        myobj1.name="Sonam";
        myobj1.salary=1234.0;
        myobj1.subject="Compiler";


        //creating an another Teacher object  and assigning the same above properties to it

        Teacher myobject2=new Teacher();

        myobject2.Dept="Docter";
        myobject2.name="Gautam";
        myobject2.subject="Networking";
        myobject2.salary=236789;


        myobj1.printDetails();
        System.out.println();
        myobject2.printDetails();
        

  }

   
}

 


    

 