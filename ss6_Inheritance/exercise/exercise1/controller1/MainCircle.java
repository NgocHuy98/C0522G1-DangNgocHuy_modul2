package ss6_Inheritance.exercise.exercise1.controller1;

import ss6_Inheritance.exercise.exercise1.model1.Circle;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1=new Circle(3.5,"yellow");
        circle1.setRadius(4);
        circle1.setColor("blue");
        System.out.println(circle1);

    }
}
