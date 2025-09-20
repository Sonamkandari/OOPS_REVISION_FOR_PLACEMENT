public class Main {
    // properties of a student
    String name;
    String course;
    int roll_no;

    void printDetails() {
        System.out.println("Name of the Student is:" + name);
        System.out.println("Course name is:" + course);
        System.out.println("Roll number of the student is:" + roll_no);
    }
    
    public static void main(String[] args) {
        // creating the object of Main class
        Main myobj = new Main();
        myobj.name = "sonam";
        myobj.course = "Btech";
        myobj.roll_no = 1234;
        myobj.printDetails();
    }
}

