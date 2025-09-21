class Shape{
    public void area1(){
        System.out.println("Display area");
    }
}

class Triangle extends Shape{
     public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
   
}
public class Multiple {
    public static void main(String[] args) {
        Triangle myobj=new Triangle();
        myobj.area1();
        myobj.area(12,15);

        System.out.println();

        Circle myobj1=new Circle();
        myobj.area1();
        myobj1.area(23);

        
    }
    
}


// it is not possible in java but can be implemented using interfaces
