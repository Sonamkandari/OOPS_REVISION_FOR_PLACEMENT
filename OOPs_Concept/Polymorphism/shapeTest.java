class shape{
    void area(){
        System.out.println("area is pie*r*r");
    }
}
// this will run when obj of the circle is created 
// Hence it is Overriding the parent method
class circle extends shape{
    @Override  // this called annotation // this is used for check only
    void area(){
        System.out.println("Area of circle");
    }
}


public class shapeTest{
    public static void main(String[] args) {
        shape s=new circle();
        s.area();
        
    }
    
}


// Parent object=new Child();
// Here, which method will be called depends on the child class
// This is known  as Up-casting

// how does java determines that which function to call
// java determines that by something we called
 
//Dynamic method Dispatch


// key word final and key word static
// final keyword is used create constant or decare the variables which has fixed values 
