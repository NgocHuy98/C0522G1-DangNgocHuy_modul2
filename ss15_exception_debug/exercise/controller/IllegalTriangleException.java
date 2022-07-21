package ss15_exception_debug.exercise.controller;

import ss15_exception_debug.exercise.model.IllegalRightTriangleException;
import ss15_exception_debug.exercise.model.Triangle;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        double firstEdge;
        double secondEdge;
        double thirdEdge;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {

                System.out.println("Nhap 3 canh cua tam giac: \n Nhap canh thu nhat: ");
                firstEdge = scanner.nextInt();
                System.out.println("Nhap canh thu hai: ");
                secondEdge = scanner.nextInt();
                System.out.println("Nhap canh thu ba: ");
                thirdEdge = scanner.nextInt();
                Triangle triangle = new Triangle(firstEdge, secondEdge, thirdEdge);
                System.out.println(triangle);
                break;

            }
            catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Nhap sai, vui long nhap so! ");
            }catch (IllegalRightTriangleException e) {
                System.out.println(e.getMessage());
                System.out.println("Nhap lai cac canh!");
            }
        }
    }
}
