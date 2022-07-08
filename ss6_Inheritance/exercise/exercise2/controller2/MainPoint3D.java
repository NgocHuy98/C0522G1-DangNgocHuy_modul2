package ss6_Inheritance.exercise.exercise2.controller2;

import ss6_Inheritance.exercise.exercise2.model2.Point3D;

public class MainPoint3D {
    public static void main(String[] args) {
        Point3D point3D=new Point3D();
        System.out.println(point3D);

        Point3D point3D1= new Point3D(6);
        point3D1.setZ(6);
        System.out.println(point3D1);

        Point3D point3D2=new Point3D(1,2,6);
        point3D2.setXYZ(1,2,3);
        System.out.println(point3D2);
    }
}
