package ss17_binary_file_serialization.exercise.system_product.controller;


import ss17_binary_file_serialization.exercise.system_product.sercive.IProductService;
import ss17_binary_file_serialization.exercise.system_product.sercive.impl.ProductService;

import java.util.Scanner;

public class SystemProduct {

    private static Scanner scanner = new Scanner(System.in);

    private static IProductService iProductService = new ProductService();

    public static void menuProduct() {

        do {
            int choose;
            while (true) {
                try {

                System.out.println("He thong quan ly san pham \n" +
                        "1. Them san pham \n" +
                        "2. Xem danh sach \n" +
                        "3. Tim kiem theo ID \n" +
                        "4. Tim kiem theo ten san pham \n" +
                        "5. Thoat");
                choose = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                    System.out.println("vui long nhap so");
                }
            }

            switch (choose) {
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    iProductService.display();
                    break;
                case 3:
                    iProductService.findId();
                    break;
                case 4:
                    iProductService.findName();
                    break;

                case 5:
                    System.exit(1);
                default:
                    System.out.println("Ban nhap so tu 1 den 5");

            }

        } while (true);

    }

}
