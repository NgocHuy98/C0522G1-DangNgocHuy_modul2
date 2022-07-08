package ss6_Inheritance.exercise.exercise3.controller3;

import ss6_Inheritance.exercise.exercise2.model2.Point;

public class MainPoint {
    public static void main(String[] args) {
        Point point =new Point();
        System.out.println(point);

        Point point1=new Point(3,6);
        point1.setX(3);
        point1.setY(6);
        System.out.println(point1);
    }
}
