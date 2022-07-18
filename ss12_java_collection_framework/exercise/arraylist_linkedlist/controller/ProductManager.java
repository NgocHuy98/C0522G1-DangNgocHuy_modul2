package ss12_java_collection_framework.exercise.arraylist_linkedlist.controller;

import ss12_java_collection_framework.exercise.arraylist_linkedlist.service.IProductService;
import ss12_java_collection_framework.exercise.arraylist_linkedlist.service.impl.ProductService;

import java.util.Scanner;

public class ProductManager {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IProductService iProductService = new ProductService();
    private static final ProductSort productSort = new ProductSort();

    public static void menuProduct() {
        do {
            System.out.println("Chao mung ban den voi he thong quan ly san pham \n" +
                    "1. Them moi san pham \n" +
                    "2. Sua thong tin san pham   \n" +
                    "3. Xoa san pham  \n" +
                    "4. Hien thi danh sach san pham \n" +
                    "5. Tim kiem san pham \n" +
                    "6. Sap xep san pham \n" +
                    "7. Thoat.");

            System.out.println("Moi ban nhap so: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iProductService.addProduct();
                    break;
                case 2:
                    iProductService.editInfoProduct();
                    break;
                case 3:
                    iProductService.removeProduct();
                    break;
                case 4:
                    iProductService.displayAllProduct();
                    break;
                case 5:
                    iProductService.findProduct();
                    break;
                case 6:
                    productSort.menuSort();
                    break;
                case 7:
                    System.exit(1);
            }
        } while (true);


    }
}
