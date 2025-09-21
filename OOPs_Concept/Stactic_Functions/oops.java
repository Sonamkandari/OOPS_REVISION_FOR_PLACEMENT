class Student{
    String name;
    static String school;// common school name // common for all students
}
public class oops {
    public static void main(String[] args) {
        Student.school="Shri Ram Krishna Academy";
        Student student1=new Student();
        student1.name="sonam";
        System.out.println(student1.name);
        System.out.println(student1.school);

        // creating an another student abject
        Student student2=new Student();
        student2.name="Rishita";
        System.out.println(student2.name);
        System.out.println(student2.school);
    }
    
}
