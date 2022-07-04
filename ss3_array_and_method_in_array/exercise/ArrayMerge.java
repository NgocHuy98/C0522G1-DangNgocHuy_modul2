package ss3_array_and_method_in_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMerge {
    //Gộp mảng
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("độ dài mảng thứ nhất");
        int length1 = sc.nextInt();
        int[] arr1 = new int[length1];
        for (int i = 0; i < length1; i++) {
            System.out.printf("Nhập arr[%d]: ", i);
            arr1[i] = sc.nextInt();
        }
        System.out.println("độ dài mảng thứ hai");
        int length2 = sc.nextInt();
        int[] arr2 = new int[length2];
        for (int i = 0; i < length2; i++) {
            System.out.printf("Nhập arr[%d]: ", i);
            arr2[i] = sc.nextInt();
        }
        System.out.println("mảng thứ nhất");
        System.out.println(Arrays.toString(arr1));
        System.out.println("mảng thứ hai");
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr1.length] = arr2[i];
        }
        System.out.println("mảng thứ ba");
        System.out.println(Arrays.toString(arr3));
    }
}
