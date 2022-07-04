package ss2_loop.exercise;

import java.util.Scanner;

public class PictureIsDisplayed {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        for (int i = 8; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        // tam giác cân
        for (int i = 1; i <= 8; i++) {
            for (int k = 8; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
