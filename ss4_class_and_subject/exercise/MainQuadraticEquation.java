package ss4_class_and_subject.exercise;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberA;
        do {
            System.out.println("nhập a");
            numberA = scanner.nextDouble();
            if (numberA == 0) {
                System.out.println("a#0, nhập lại a ");
                numberA = scanner.nextDouble();
            }
        } while (numberA == 0);
        System.out.println("nhập b");
        double numberB = scanner.nextDouble();

        System.out.println("nhập c");
        double numberC = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(numberA, numberB, numberC);
        System.out.println("Delta = " + quadraticEquation.getDelta());
        System.out.println(quadraticEquation.getDisplay());
    }
}
