package chp10.ex10_6;

import java.util.ArrayList;

public class AreaCalculator {
    public static void main(String[] args) {
        Square s = new Square();
        s.setName("정사각형");
        s.setWidth(7);

        Triangle t = new Triangle();
        t.setName("삼각형");
        t.setWidth(15);
        t.setHeight(9);

        Circle c = new Circle();
        c.setName("원");
        c.setR(15);

        Shape[] arr = {s, t, c};


//        ArrayList<Shape> arrlist = new ArrayList<>();
//        arrlist.add(s);
//        arrlist.add(t);
//        arrlist.add(c);
//
        viewShapes(arr);
    }
    public static void viewShapes(Shape[] arrList) {
        for(Shape shape : arrList) {
            System.out.printf("%s의 넓이 : %.2f㎠ \n",shape.getName(),shape.area());
        }
    }
}
