package ss11_dsa_stack_queue.exercise.check_brackets.controller;

import ss11_dsa_stack_queue.exercise.check_brackets.service.Brackets;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao 1 chuoi");
        String characters=scanner.nextLine();

        if (Brackets.checkBrackets(characters)) {
            System.out.println("dung ");
        }else {
            System.out.println("sai ");
        }
    }
}
