// inheritance increases reusability of a code
//Example -> for example in a website  i have to create a lot of buttons so what can i do i can create a single class which will define the complete structure of the button
// extends that shape of the button every time whenever i needed  to  create a button
class Shapes{
   String color;
}
// extends refers to inheriting properties from a parent class by a child class
class rectangle extends Shapes{
    // inheritance refers here that the triangle class will have a property colour with  it because it is extending the shapes class 
    //shape class is having the colour  property
    int length;
    int breadth;

    public void rectangleArea(){
        int area=length*breadth;
        System.out.println(area);

    }
    
    
}

//Another class which is inheriting the properties of a parent class
class square extends Shapes{
    int side;
  
    public void squareArea(){
          int area=side*side;
        System.out.println(area);

    }

}

public class Shape {
    public static void main(String[] args) {
        rectangle myobj1=new rectangle();
        myobj1.color="red";
        myobj1.length=32;
        myobj1.breadth=21;
        myobj1.rectangleArea();

        System.err.println();
        

        square myobj2=new square();
        myobj2.side=25;
        myobj2.squareArea();
    }
    
}
