package ss14_sort_algorithm.practice.illustration_bubble_sort;

import java.util.Arrays;
import java.util.Scanner;

public class MainBubbleSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter list size:");
        int size=scanner.nextInt();
        int[] list = new int[size];

        for(int i = 0;i< list.length;i++){
            System.out.println("Nhap phan tu thu "+i+" : ");
            list[i]=scanner.nextInt();
        }
        System.out.println("mang vua tao: "+Arrays.toString(list));
        bubbleSort(list);

    }
    public static void bubbleSort(int[] list){
        boolean needNextPass = true;
        for (int i = 0; i < list.length-1 && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length -1 - i; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    System.out.println("Swap " + list[i] + " with " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; /* Next pass still needed */
                }
            }
            /* Array may be sorted and next pass not needed */
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            /* Show the list after sort */
            System.out.print("List after the  " + i + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }

    }
}
