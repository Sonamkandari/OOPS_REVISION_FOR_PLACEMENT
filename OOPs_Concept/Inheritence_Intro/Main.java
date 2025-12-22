public class Main {
    public static void main(String[] args) {
        Box box=new Box();
        // this will check that which constructor is there which has no arguments
        System.out.println(box.l+" "+box.w+" "+box.h);

        Box box2=new Box(45);// this will check which constructor is there has only one argument
        System.out.println(box2.l);

        BoxHeight box3=new BoxHeight();
       
        System.out.println(box3.h+" "+ box3.Height);


    }
    
}
