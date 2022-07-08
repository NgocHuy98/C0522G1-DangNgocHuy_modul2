package ss6_Inheritance.practice;

public class MainShape {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        Shape shape1 = new Shape();
        shape1.setColor("red");
        shape1.setFilled(true);
        System.out.println(shape1);
    }
}
