package ss12_java_collection_framework.exercise.arraylist_linkedlist.service.impl;

import ss12_java_collection_framework.exercise.arraylist_linkedlist.model.Product;
import ss12_java_collection_framework.exercise.arraylist_linkedlist.service.IProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService<E> implements IProductService {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Product> productList = new ArrayList<>();


    @Override
    public void addProduct() {
        Product product = infoProduct();
        productList.add(product);
        System.out.println("Them moi thanh cong!. ");

    }

    @Override
    public void editInfoProduct() {
        System.out.println("Moi ban nhap id cua san pham can sua: ");
        int idEdit = Integer.parseInt(scanner.nextLine());

        boolean isFlag = false;
        for (Product product : productList) {
            if (product.getId() == idEdit) {
                System.out.print("Nhap ten san pham: ");
                product.setName(scanner.nextLine());

                System.out.print("Nhap gia san pham: ");
                product.setPrice(Double.parseDouble(scanner.nextLine()));

            }
            isFlag = true;

            break;
        }
        if (!isFlag) {
            System.out.println("Khong tim thay");

        }
    }

    @Override
    public void removeProduct() {
        System.out.println("Moi ban nhap id cua san pham can xoa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());

        boolean isFlag = false;
        for (Product product : productList) {
            if (product.getId() == idRemove) {
                System.out.println(" Ban co chac muon xoa hay khong? \n" +
                        "1. Co \n" +
                        "2. Khong");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    productList.remove(product);
                    System.out.println("Xoa thanh cong!.");
                }
                isFlag = true;
                break;

            }
        }
        if (!isFlag) {
            System.out.println("Khong tim thay");
        }
    }

    @Override
    public void displayAllProduct() {
        System.out.println("Danh sach san pham");
        for(Product product:productList){
            System.out.println(product);
        }
    }

    @Override
    public void findProduct() {
        System.out.println("Nhap vao id cua san pham can tim: ");
        int idFind = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Product product:productList){
            if(idFind==product.getId()){
                System.out.println(product);
               isFlag =true;
                break;
            }
        }
        if(!isFlag){
            System.out.println("Khong tim thay");
        }
    }

    @Override
    public void sortAscending() {
        AscendingService ascendingService=new AscendingService();
        productList.sort(ascendingService);

    }

    @Override
    public void sortDecrease() {
        DecreaseService decreaseService=new DecreaseService();
        productList.sort(decreaseService);
    }


    public static Product infoProduct() {
        System.out.print("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap ten san pham: ");
        String name = scanner.nextLine();

        System.out.print("Nhap gia san pham: ");
        double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product(name, id, price);
        return product;
    }


}
