package case_study.controller;

import case_study.serviece.ICustomerService;
import case_study.serviece.impl.CustomerService;


import java.util.Scanner;

public class CustomerManagement {

    private Scanner scanner = new Scanner(System.in);
    private ICustomerService iCustomerService = new CustomerService();

    public void menuCustomerManagement() {
        do {
            int choose;
            while (true) {
                try {
                    System.out.println("Customer Management: \n" +
                            "Please choose!\n" +
                            "1. Display list customer  \n" +
                            "2. Add new customer \n" +
                            "3. Edit customer \n" +
                            "4. Return main menu.");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Vui long nhap so");
                }
            }

            switch (choose) {
                case 1:
                    iCustomerService.display();
                    break;
                case 2:
                    iCustomerService.add();
                    break;
                case 3:
                    iCustomerService.edit();
                    break;
                case 4:
                    return;
            }
        } while (true);

    }
}

