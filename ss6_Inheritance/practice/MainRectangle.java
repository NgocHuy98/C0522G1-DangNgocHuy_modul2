package ss6_Inheritance.practice;

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setLength(3.8);
        rectangle1.setWidth(2.5);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setWidth(2.5);
        rectangle2.setLength(4.8);
        rectangle2.setColor("orange");
        rectangle2.setFilled(false);
        System.out.println(rectangle2);
    }
}
