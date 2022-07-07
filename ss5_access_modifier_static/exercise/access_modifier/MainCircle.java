package ss5_access_modifier_static.exercise.access_modifier;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle.display());

        Circle circle1=new Circle(100);
        System.out.println(circle1.display());

    }

}
