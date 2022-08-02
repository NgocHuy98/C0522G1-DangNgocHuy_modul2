package case_study.serviece.impl;
import case_study.model.Customer;
import case_study.model.Employee;
import case_study.serviece.DuplicateIDException;
import case_study.serviece.IEmployeeService;
import case_study.utils.ReadFileEmployee;
import case_study.utils.RegexDate;
import case_study.utils.WriteFileEmployee;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "case_study/data/employee.csv";

    public void writeFile() {
        WriteFileEmployee.writeEmployeeFile(PATH, employeeList);
    }

    public void readFile() {
        List<Employee> list = ReadFileEmployee.readEmployeeFile(PATH);
        employeeList.clear();
        employeeList.addAll(list);
    }


    @Override
    public void display() {
        readFile();
        for (Employee employee : employeeList) {
            System.out.println("Danh sach nhan vien: " + employee);
        }

    }

    @Override
    public void add() {
        readFile();
        Employee employee = infoEmployee();
        employeeList.add(employee);
        System.out.println("them moi thanh cong: ");
        writeFile();

    }

    @Override
    public void edit() {
        readFile();
        String codeFind;

        System.out.println("Nhap vao ma cua nhan vien can tim: ");
        codeFind = scanner.nextLine();

        boolean check = true;
        boolean isFlag = false;

        for (Employee employee : employeeList) {
            if (codeFind.equals(employee.getCode())) {
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
                                    "7. Trinh do  \n" +
                                    "8. Vi tri \n" +
                                    "9. Luong \n" +
                                    "10. Tro ve giao dien ");

                            choose = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Vui long nhap so");
                        }
                    }
                    switch (choose) {
                        case 1:
                            employee.setName(formatName());
                            System.out.println("Thiet lap thanh cong !!!");
                            System.out.println(employee);
                            break;
                        case 2:
                            employee.setDateOfBirth(RegexDate.getDateOfBirth());
                            System.out.println("Thiet lap thanh cong !!!");
                            System.out.println(employee);
                            break;
                        case 3:
                            System.out.println("Nhap gioi tinh: ");
                            employee.setGender(scanner.nextLine());
                            System.out.println(employee);
                            break;
                        case 4:
                            employee.setId(setID());
                            System.out.println("Thiet lap thanh cong !!!");
                            System.out.println(employee);
                            break;
                        case 5:
                            employee.setPhoneNumber(setPhoneNumbers());
                            System.out.println("Thiet lap thanh cong !!!");
                            System.out.println(employee);
                            break;
                        case 6:
                            employee.setEmail(setEmail());
                            System.out.println("Thiet lap thanh cong !!!");
                            System.out.println(employee);
                            break;
                        case 7:
                            employee.setLevel(menuLevel());
                            System.out.println("Thiet lap thanh cong !!!");
                            System.out.println(employee);
                            break;
                        case 8:
                            employee.setPosition(menuPosition());
                            System.out.println("Thiet lap thanh cong !!!");
                            System.out.println(employee);
                            break;
                        case 9:
                            employee.setSalary(setSalary());
                            System.out.println("Thiet lap thanh cong !!!");
                            System.out.println(employee);
                            break;
                        case 10:
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

    public static String menuLevel() {
        do {
            int choose;
            while (true) {
                try {
                    System.out.println("Chon trinh do: \n" +
                            "1. Trung cap \n" +
                            "2. Cao dang \n" +
                            "3. Dai hoc \n" +
                            "4. Sau dai hoc ");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Vui long nhap so");
                }
            }

            switch (choose) {
                case 1:
                    return "Trung cap";
                case 2:
                    return "Cao dang";
                case 3:
                    return "Dai hoc";
                case 4:
                    return "Sau dai hoc";
            }

        } while (true);

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
                for (Employee employee : employeeList) {
                    if (employee.getId().equals(id)) {
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


    public static String menuPosition() {
        do {
            int choose;
            while (true) {

                try {
                    System.out.println("Chon vi tri: \n" +
                            "1. Le tan \n" +
                            "2. Phuc vu \n" +
                            "3. Chuyen vien \n" +
                            "4. Giam sat \n" +
                            "5. Quan ly \n" +
                            "6. Giam doc");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Vui long nhap so");
                }
            }

            switch (choose) {
                case 1:
                    return "Le tan";
                case 2:
                    return "Phuc vu";
                case 3:
                    return "Chuyen vien";
                case 4:
                    return "Giam sat";
                case 5:
                    return "Quan ly";
                case 6:
                    return "Giam doc";
            }

        } while (true);

    }

    public static double setSalary() {
        double salary;
        while (true) {
            try {
                System.out.print("Nhap luong: ");
                salary = Double.parseDouble(scanner.nextLine());
                break;

            } catch (NumberFormatException e) {
                System.out.print("Nhap so!");
            }
        }
        return salary;
    }

    public static String setPhoneNumbers(){
        String phoneNumber;
        while (true){
            try {
                System.out.println("Nhap so dien thoai");
                phoneNumber=scanner.nextLine();

                for (Employee employee:employeeList){
                    if(employee.getPhoneNumber().equals(phoneNumber)){
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

    public static Employee infoEmployee() {
        String code;
        while (true) {
            try {
                System.out.print("Nhap ma nhan vien: ");
                code = scanner.nextLine();
                for (Employee employee : employeeList) {
                    if (employee.getCode().equals(code)) {
                        throw new DuplicateIDException("Trung ma nhan vien!!!");
                    }
                }
                break;
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        String name = formatName();

        String dateOfBirth=RegexDate.getDateOfBirth();

        System.out.print("Nhap gioi tinh: ");
        String gender = scanner.nextLine();

        String id = setID();

        String phoneNumber=setPhoneNumbers();

        System.out.print("Nhap email: ");
        String email = setEmail();

        System.out.print("Nhap trinh do: ");
        String level = menuLevel();

        System.out.print("Nhap vi tri: ");
        String position = menuPosition();

        double salary = setSalary();

        return new Employee(code, name, dateOfBirth, gender, id, phoneNumber, email, level, position, salary);

    }
}

