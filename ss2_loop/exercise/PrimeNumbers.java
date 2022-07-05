package ss2_loop.exercise;

import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int number;

        do {
            System.out.println("nhập vào một số ngẫu nhiên");
            number = sr.nextInt();
            if (number < 0) {
                System.out.println("số lớn hơn 0.yêu cầu nhập lại");
            }
        } while (number < 0);

        if (isPrime(number)) {
            System.out.printf("%d là số nguyên tố", number);
        } else {
            System.out.printf("%d không phải là số nguyên tố", number);
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

//public class PrimeNumbers {
//    public static void main(String[] args) {
//        int numbers;
//        int count=0;
//        int prime=2;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        numbers = sc.nextInt();
//        while (count<numbers){
//            int division=0;
//            for (int i=1;i<=prime;i++){
//                if(prime%i==0){
//                    division++;
//                }
//            }
//            if(division==2){
//                System.out.println(prime);
//                count++;
//            }
//            prime++;
//        }
//    }
//}
