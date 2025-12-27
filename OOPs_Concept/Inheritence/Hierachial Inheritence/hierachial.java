// multiple Derived classes extends the parent or base class
// one class is inherited by many classes
// class A is extended by class B,class C,and class D
class shape{
    int num=90;
    void display(){
        System.out.println("hello i am the senior");
    }

}
class rectangle extends shape{
    void  showHierchy(){
        System.out.println("I will inherit properties of  senior only  and i am junior");
    }

}

class Triangle extends shape{

    void showHierchy2(){
        System.out.println("I will inherit properties of senior");
    }
    

}

public class hierachial {
    public static void main(String[] args) {

        rectangle myob=new rectangle();
        myob.display();
        myob.showHierchy();


        Triangle myobj2=new Triangle();
        myobj2.display();
        myobj2.showHierchy2();
   
    }


    
}
