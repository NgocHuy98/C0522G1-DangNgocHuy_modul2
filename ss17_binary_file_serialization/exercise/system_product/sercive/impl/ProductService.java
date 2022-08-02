package ss17_binary_file_serialization.exercise.system_product.sercive.impl;

import ss10_list.exercise.newbt.service.impl.DuplicateIDException;
import ss17_binary_file_serialization.exercise.system_product.model.Product;
import ss17_binary_file_serialization.exercise.system_product.sercive.IProductService;
import ss17_binary_file_serialization.exercise.system_product.utils.ReadFile;
import ss17_binary_file_serialization.exercise.system_product.utils.WriteFile;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static final String PATH = "ss17_binary_file_serialization/exercise/system_product/product.txt";

    private static List<Product> productList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public void writeFile() {
        WriteFile.writeFile(PATH, productList);
    }

    public void readFile() {
        List<Product> list = ReadFile.readFile(PATH);
        productList.clear();
        productList.addAll(list);
    }


    @Override
    public void add() {


        Product product = infoProduct();
        productList.add(product);
        System.out.println("them moi thanh cong: ");
        writeFile();

    }

    private Product infoProduct() {
        int id;
        while (true) {
            try {
                System.out.print("Nhap id: ");
                id = Integer.parseInt(scanner.nextLine());
                for (Product product : productList) {
                    if (product.getId() == id) {
                        throw new DuplicateIDException("Trung ID san pham!!!");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so!!!");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }


        System.out.print("Nhap name: ");
        String name = scanner.nextLine();

        System.out.print("Nhap hang san xuat: ");
        String manufacturer = scanner.nextLine();


        double price;
        while (true) {
            try {
                System.out.print("Nhap gia: ");
                price = Double.parseDouble(scanner.nextLine());
                break;

            } catch (NumberFormatException e) {
                System.out.print("Nhap so!");
            }
        }

        System.out.print("Nhap ngay san xuat: ");
        String dateOfManufacture = scanner.nextLine();

        System.out.print("Nhap hang su dung: ");
        String expiry = scanner.nextLine();

        return new Product(id, name, manufacturer, price, dateOfManufacture, expiry);

    }

    @Override
    public void display() {
        readFile();
        for (Product product : productList) {
            System.out.println("Danh sach san pham: " + product);
        }

    }

    @Override
    public void findId() {
        readFile();
        System.out.println("Nhap vao id cua san pham can tim: ");
        int idFind = Integer.parseInt(scanner.nextLine());

        boolean isFlag = false;
        for (Product product : productList) {
            if (idFind == product.getId()) {
                System.out.println(product);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("Khong tim thay");
        }

    }

    @Override
    public void findName() {

        readFile();
        System.out.println("Nhap vao ten cua san pham can tim: ");
        String name = scanner.nextLine();

        boolean isFlag = false;
        for (Product product : productList) {
            if (product.getName().contains(name)) {
                System.out.println(product);
                isFlag = true;

            }
        }
        if (!isFlag) {
            System.out.println("Khong tim thay");
        }

    }

}