package ss7_abstract_iterface.practice.practice2.controller2;

import ss7_abstract_iterface.practice.practice2.model2.ComparableCircle;

import java.util.Arrays;

public class MainComparableCircle {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle();

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
