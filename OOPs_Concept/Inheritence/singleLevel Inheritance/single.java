// this is the example of single level inheritance
class Shapes{
    //properties of shape class 
    public void area(){
        System.out.println("Display the area");
    }

}
// One class extends to another class.
//  A child class extends to the parent class.
//  The child class uses the properties of the parent's class. 
class Triangle extends Shapes{
    public void area(int l,int h){
        System.out.println(1/2*(l*h));
    }
}

public class single {
    public static void main(String[] args) {
        Triangle myobj=new Triangle();
        myobj.area();
        myobj.area(5,6);
        
        
    }
    
}
