public class shape{
    void area(){
        System.out.println("area is pie*r*r");
    }
}

public class circle extends shape{
    @Override
    void area(){
        System.out.println("Area of circle");
    }
}

public class shapeTest{
    public static void main(String[] args) {
        Shape s=new circle();
        s.area1();
        
    }
    
}





