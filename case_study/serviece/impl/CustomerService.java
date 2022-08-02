package case_study.serviece.impl;

import case_study.model.Customer;
import case_study.serviece.DuplicateIDException;
import case_study.serviece.ICustomerService;
import case_study.utils.ReadFileCustomer;
import case_study.utils.RegexDate;
import case_study.utils.WriteFileCustomer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "case_study/data/customer.csv";

    public void writeFile() {
        WriteFileCustomer.writeCustomerFile(PATH, customerList);
    }

    public void readFile() {
        List<Customer> list = ReadFileCustomer.readCustomerFile(PATH);
        customerList.clear();
        customerList.addAll(list);
    }

    @Override
    public void display() {
        readFile();
        for (Customer customer : customerList) {
            System.out.println("Danh sach khach hang: " + customer);
        }

    }

    @Override
    public void add() {
        readFile();
        Customer customer = infoCustomer();
        customerList.add(customer);
        System.out.println("them moi thanh cong: ");
        writeFile();

    }

    @Override
    public void edit() {
        readFile();
        String codeFind;

        System.out.println("Nhap vao ma cua khach hang can tim: ");
        codeFind = scanner.nextLine();

        boolean check = true;
        boolean isFlag = false;

        for (Customer customer : customerList) {
            if (codeFind.equals(customer.getCode())) {
                isFlag = true;
                int choose;
                do {


                    while (true) {

                        try {

                            System.out.println("Chon muc can sua: \n" +
                                    "1. Ten \n" +
                                    "2. Ngay sinh \n" +
                                    "3. Gioi tinh \n" +
                                    "4. CMND \n" +
                                    "5. So dien thoai \n" +
                                    "6. Email \n" +
                                    "7. Loai khach hang \n" +
                                    "8. Dia chi \n" +
                                    "9. Tro ve giao dien ");

                            choose = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Vui long nhap so");
                        }
                    }
                    switch (choose) {
                        case 1:
                            customer.setName(formatName());
                            System.out.println("Thiet lap thanh cong !!!");
                            System.out.println(customer);
                            break;
                        case 2:
                            customer.setDateOfBirth(RegexDate.getDateOfBirth());
                            System.out.println("Thiet lap thanh cong !!!");
                            System.out.println(customer);
                            break;
                        case 3:
                            System.out.println("Nhap gioi tinh: ");
                            customer.setGender(scanner.nextLine());
                            System.out.println("Thiet lap thanh cong !!!");
                            System.out.println(customer);
                            break;
                        case 4:
                            customer.setId(setID());
                            System.out.println("Thiet lap thanh cong !!!");
                            System.out.println(customer);
                            break;
                        case 5:
                            customer.setPhoneNumber(setPhoneNumbers());
                            System.out.println("Thiet lap thanh cong !!!");
                            System.out.println(customer);
                            break;
                        case 6:
                            customer.setEmail(setEmail());
                            System.out.println("Thiet lap thanh cong !!!");
                            System.out.println(customer);
                            break;
                        case 7:
                            customer.setCustomerType(menuCustomerType());
                            System.out.println("Thiet lap thanh cong !!!");
                            System.out.println(customer);
                            break;
                        case 8:
                            System.out.println("Nhap dia chi: ");
                            customer.setAddress(scanner.nextLine());
                            System.out.println("Thiet lap thanh cong !!!");
                            System.out.println(customer);
                            break;
                        case 9:
                            check = false;
                            break;

                    }
                } while (check);

            }

        }
        if (!isFlag) {
            System.out.println("Khong tim thay");
        }

    }


    public static String formatName() {
        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();
        String[] arr = name.toLowerCase().trim().split("");
        StringBuilder str = new StringBuilder().append(arr[0].toUpperCase());
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals(" ")) {
                if (arr[i - 1].equals(" ")) {
                    str.append(arr[i].toUpperCase());
                } else {
                    str.append(arr[i]);
                }
            } else if (!arr[i + 1].equals(" ")) {
                str.append(arr[i]);
            }
        }
        return str.toString();
    }

    public static String menuCustomerType() {
        do {
            System.out.println("Chon : \n" +
                    "1. Diamond \n" +
                    "2. Platinium \n" +
                    "3. Gold \n" +
                    "4. Silver \n" +
                    "5. Member ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    return "Diamond";
                case 2:
                    return "Platinium";
                case 3:
                    return "Gold";
                case 4:
                    return "Silver";
                case 5:
                    return "Member";
            }

        } while (true);

    }


    public static int setPhoneNumber() {
        int phoneNumber;
        while (true) {
            try {
                System.out.print("Nhap so dien thoai: ");
                phoneNumber = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so");
            }
        }
        return phoneNumber;
    }

    public static String setID() {
        String id;
        while (true) {
            try {
                System.out.print("Nhap ID: ");
                id = scanner.nextLine();
                if(id.matches("\\d{9}")) {
                    break;
                }else {
                    System.out.println("nhap sai dinh dang, CMND co 9 so");
                }
                for (Customer customer : customerList) {
                    if (customer.getId().equals(id)) {
                        throw new DuplicateIDException("CMND da ton tai, vui long nhap lai!!!");
                    }
                }
                break;
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }
        return id;
    }

    public static String setPhoneNumbers(){
        String phoneNumber;
        while (true){
            try {
                System.out.println("Nhap so dien thoai");
                phoneNumber=scanner.nextLine();
                for (Customer customer:customerList){
                    if(customer.getPhoneNumber().equals(phoneNumber)){
                        throw new DuplicateIDException("Trung so dien thoai, nhap lai");
                    }
                }
                break;
            }catch (DuplicateIDException e){
                System.out.println(e.getMessage());
            }
        }
        return phoneNumber;
    }

    public static String setEmail(){
        String email;
        while (true) {
            System.out.println("nhap email ");
            email = scanner.nextLine();
            if(email.matches("^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z0-9]+$")) {
                break;
            }else {
                System.out.println("nhap sai dinh dang,XXX@YYY.NNN trong do XX la ki tu ngau nhien,YY la ki tu it nhat");
            }
        }
        return email;
    }

    public static Customer infoCustomer() {
        String code;
        while (true) {
            try {
                System.out.print("Nhap ma khach hang: ");
                code = scanner.nextLine();
                for (Customer customer : customerList) {
                    if (customer.getCode().equals(code)) {
                        throw new DuplicateIDException("Ma khach hang da ton tai, vui long nhap lai!!!");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so!!!");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        String name = formatName();

        String dateOfBirth= RegexDate.getDateOfBirth();

        System.out.print("Nhap gioi tinh: ");
        String gender = scanner.nextLine();

        String id = setID();

       String phoneNumber=setPhoneNumbers();

        String email = setEmail();

        System.out.println("Nhap loai khach hang: ");
        String customerType = menuCustomerType();

        System.out.print("Nhap dia chi: ");
        String address = scanner.nextLine();


        return new Customer(code, name, dateOfBirth, gender, id, phoneNumber, email, customerType, address);

    }
}
