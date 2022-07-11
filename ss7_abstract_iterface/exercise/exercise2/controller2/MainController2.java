package ss7_abstract_iterface.exercise.exercise2.controller2;

import ss7_abstract_iterface.exercise.exercise2.model2.Circle;
import ss7_abstract_iterface.exercise.exercise2.model2.Rectangle;
import ss7_abstract_iterface.exercise.exercise2.model2.Shape;
import ss7_abstract_iterface.exercise.exercise2.model2.Square;


public class MainController2 {
    public static void main(String[] args) {
        Shape[] shape=new Shape[3];
        shape[0] = new Circle(4);
        shape[1] = new Rectangle(5,10);
        shape[2] = new Square(7);
        for (Shape shape1 : shape) {
            System.out.println(shape1);
            if (shape1 instanceof Square) {
                Shape shape2 = (Square) shape1;
                System.out.println(shape2.howToColor());
            }
        }
    }
}
