package ss11_dsa_stack_queue.exercise.reserve_integer_stack.model;

import java.util.Scanner;
import java.util.Stack;

public class StackStudy {
    private static Scanner scanner = new Scanner(System.in);

    public static void reserveInteger() {
        Stack<Integer> integerStack = new Stack<>();
        System.out.println("nhap do dai: ");
        int length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            System.out.printf("nhap phan tu [%d] :", i);
            integerStack.push(scanner.nextInt());
        }
        System.out.println("mang ban đau: " + integerStack);
        Stack<Integer> newStack = new Stack<>();
        while (!integerStack.isEmpty()) {
            newStack.push(integerStack.pop());
        }
        for (int element : newStack) {
            integerStack.push(element);
        }
        System.out.println("mang da dao nguoc: " + integerStack);
    }

    public static void reserveString() {
        Stack<Character> characterStack = new Stack<>();
        System.out.println("nhap chuoi");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            characterStack.push(ch);
        }
        System.out.println("chuoi ban dau: " + characterStack);

        Stack<Character> newChaStack = new Stack<>();
        while (!characterStack.isEmpty()) {
            newChaStack.push(characterStack.pop());
        }
        for (Character element : newChaStack) {
            characterStack.push(element);
        }
        System.out.println("chuoi da dao nguoc: " + characterStack);
    }

}
