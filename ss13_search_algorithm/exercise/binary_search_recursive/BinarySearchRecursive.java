package ss13_search_algorithm.exercise.binary_search_recursive;


import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao do dai mang: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap phan tu thu " + i + " :");
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhap so can tim ");
        int value = scanner.nextInt();
        System.out.println(binarySearch(arr, 0, length - 1, value));

//     Săp xep k can sort
//        int temp = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
    }

    public static int binarySearch(int[] arr, int left, int right, int value) {
        if (right >= left) {
            int mid = (left + right) / 2;

            if (value == arr[mid]) {
                return mid;

            }
            if (value > arr[mid]) {
                return binarySearch(arr, mid + 1, right, value);
            }
            return binarySearch(arr, left, mid - 1, value);
        }
        return -1;

    }
}
