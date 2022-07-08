package ss6_Inheritance.exercise.exercise1.controller1;

import ss6_Inheritance.exercise.exercise1.model1.Cylinder;

public class MainCylinder {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);

        Cylinder cylinder1=new Cylinder(5);
        cylinder1.setHeight(5);
        System.out.println(cylinder1);

        Cylinder cylinder2= new Cylinder(5,"red",7);
        cylinder2.setRadius(6);
        cylinder2.setColor("black");
        cylinder2.setHeight(10);
        System.out.println(cylinder2);
    }
}
