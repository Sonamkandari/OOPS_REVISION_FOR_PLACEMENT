
// this is the example of Multi  level inheritance level inheritance
class Shapes{
    //properties of shape class 
    public void area(){
        System.out.println("Display the area");
    }

}

// this class inheriting properties from a parent class

class Triangle extends Shapes{
    public void area(int l,int h){
        System.out.println(1/2*(l*h));
    }
}

// this class is inheriting properties from a class which is already hearing properties from an another class 

class Equilateral extends Triangle{
    public void area(int l,int h){
         System.out.println(1/2*(l*h));

    }
}

public class multile{
    public static void main(String[] args) {
        Triangle myobj=new Triangle();
        myobj.area();
        myobj.area(5,6);
        
        
    }
    
}
