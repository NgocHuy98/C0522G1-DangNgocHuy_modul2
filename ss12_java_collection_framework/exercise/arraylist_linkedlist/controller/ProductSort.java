package ss12_java_collection_framework.exercise.arraylist_linkedlist.controller;

import ss12_java_collection_framework.exercise.arraylist_linkedlist.service.IProductService;
import ss12_java_collection_framework.exercise.arraylist_linkedlist.service.impl.ProductService;


import java.util.Scanner;

public class ProductSort {
    private Scanner scanner = new Scanner(System.in);
    private IProductService iProductService = new ProductService<>();

    public void menuSort() {
        do {
            System.out.println("Moi ban chon \n" +
                    "1. Sap xep giam dan \n" +
                    "2. Sap xep tang dan \n" +
                    "3. Quay ve menu chinh.");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iProductService.sortAscending();
                    iProductService.displayAllProduct();
                    break;
                case 2:
                    iProductService.sortDecrease();
                    iProductService.displayAllProduct();
                    break;
                case 3:
                    return;
            }

        } while (true);
    }

}
