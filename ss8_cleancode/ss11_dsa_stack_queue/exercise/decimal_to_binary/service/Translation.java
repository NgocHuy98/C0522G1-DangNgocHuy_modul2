package ss11_dsa_stack_queue.exercise.decimal_to_binary.service;

import java.util.Scanner;
import java.util.Stack;

public class Translation {
    private static Scanner scanner=new Scanner(System.in);
    public static void decimalToBinary() {
        Stack<Integer> integerStack=new Stack<>();
        System.out.println("nhap so he thap phan: ");
        int decimal= Integer.parseInt(scanner.nextLine());

        while (decimal>0) {
            integerStack.push(decimal%2);
            decimal/=2;
        }
        System.out.println("day so he nhi phan: ");
        while (!integerStack.isEmpty()) {
            System.out.print(integerStack.pop());
        }
    }

}
