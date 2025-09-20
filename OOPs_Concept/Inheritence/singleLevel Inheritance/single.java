// this is the example of single level inheritance
class Shapes{
    //properties of shape class 
    public void area(){
        System.out.println("Display the area");
    }

}

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
