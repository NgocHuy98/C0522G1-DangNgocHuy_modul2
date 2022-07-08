package ss6_Inheritance.exercise.exercise3.controller3;

import ss6_Inheritance.exercise.exercise3.model3.MovablePoint;

public class MainMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        System.out.println(movablePoint.move()+"\n");

        MovablePoint movablePoint1 = new MovablePoint(1,2);
        movablePoint1.setX(1);
        movablePoint1.setY(2);
        System.out.println(movablePoint1);
        System.out.println(movablePoint1.move()+"\n");

        MovablePoint movablePoint2 = new MovablePoint(3,4,5,6);
        movablePoint2.setSpeed(5,6);
        System.out.println(movablePoint2);
        System.out.println(movablePoint2.move());

    }
}
