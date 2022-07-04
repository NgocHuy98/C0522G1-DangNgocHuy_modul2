package ss2_loop.exercise;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int numbers;
        int count=0;
        int prime=2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        numbers = sc.nextInt();
        while (count<numbers){
            int division=0;
            for (int i=1;i<=prime;i++){
                if(prime%i==0){
                    division++;
                }
            }
            if(division==2){
                System.out.println(prime);
                count++;
            }
            prime++;
        }
    }
}
