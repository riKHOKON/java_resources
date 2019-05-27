package schildt_proj.Inheriance_7.inheritance_example;


/**
 * Created by RI on 5/28/2017.
 */
public class DynShapes {
    public static void main(String args[]){
        TwoDShape shapes[] = new TwoDShape[5];

        shapes[0] = new Triangle(8.0,12.0,"outlined");
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10);
        shapes[3] = new Triangle(7);
        //System.out.println(shapes[2].equals(shapes[1]));
        //shapes[4] = new Triangle(8);


//        for (TwoDShape s : shapes) {
//            if (s == null){
//                System.out.println("this is empty.");
//            }else{
//                System.out.println("Object is an : "+s.getName());
//                System.out.println("Area is : "+s.area());
//                System.out.println("*********************");
//            }
//        }
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] == null){
                System.out.println("Index shapes["+i+"] is empty.");
            }
            else{
                System.out.println("Object is an : "+shapes[i].getName());
                System.out.println("Area is : "+shapes[i].area());
                System.out.println("*********************");
            }
           }
    }
}
