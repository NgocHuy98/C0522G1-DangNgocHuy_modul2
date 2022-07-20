package ss14_sort_algorithm.exercise.insertion_sort_set;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];

        for (int i = 0; i < list.length; i++) {
            System.out.println("Nhap phan tu thu " + i + " : ");
            list[i] = scanner.nextInt();
        }
        System.out.println("mang vua tao: " + Arrays.toString(list));
        insertionSort(list);
        System.out.println("mang vua sap xep: " + Arrays.toString(list));

    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
    }

}
