package ss3_array_and_method_in_array.exercise;

import java.util.Arrays;

import java.util.Scanner;

public class ElementAdd {
    //Thêm phần tử vào vị trí bất kì trong mảng
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập array[%d]: ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa tạo: ");
        System.out.println(Arrays.toString(arr));

        int[] newArr = new int[length + 1];
        System.out.println("Nhập phần tử cần chèn vào mảng: ");
        int number = sc.nextInt();
        int index,i;
        do {
            System.out.println("Nhập vị trí chèn: ");
            index = sc.nextInt();
            if (index < 0 || index > arr.length) {
                System.out.println("Không chèn được, nhập lại vị trí ");
            }
        } while (index < 0 || index > arr.length);
        for ( i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = number;
        for ( i = index + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        arr = newArr;
        System.out.println("Mảng sau khi chèn");
        System.out.println(Arrays.toString(arr));
    }
}
