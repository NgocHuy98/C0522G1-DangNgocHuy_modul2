package ss6_Inheritance.practice;

public class MainCircle {

        public static void main(String[] args) {
            Circle circle = new Circle();
            System.out.println(circle);

            Circle circle1 = new Circle(4);
            circle1.setRadius(6);
            System.out.println(circle1);

            Circle circle2 = new Circle(3.5,"red",true);
            circle2.setRadius(3.5);
            circle2.setColor("indigo");
            circle2.setFilled(false);
            System.out.println(circle2);
        }

}
