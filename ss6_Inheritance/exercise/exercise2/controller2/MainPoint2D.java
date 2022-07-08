package ss6_Inheritance.exercise.exercise2.controller2;

import ss6_Inheritance.exercise.exercise2.model2.Point;

public class MainPoint2D {
    public static void main(String[] args) {
        Point point =new Point();
        System.out.println(point);

        Point point2D1=new Point(3,6);
        point2D1.setX(3);
        point2D1.setY(6);
        System.out.println(point2D1);
    }
}
