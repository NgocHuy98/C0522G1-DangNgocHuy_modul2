package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        CustomerManagement customerManagement = new CustomerManagement();
        FacilityManagement facilityManagement = new FacilityManagement();
        BookingManagement bookingManagement = new BookingManagement();
        PromotionManagement promotionManagement = new PromotionManagement();
        Scanner scanner = new Scanner(System.in);
        do {
            int choose;
            while (true) {
                try {
                    System.out.println("He thong quan ly resort Furama. \n" +
                            "1. Employee Management.\n" +
                            "2. Customer Management.\n" +
                            "3. Facility Management.\n" +
                            "4. Booking Management \n" +
                            "5. Promotion Management\n" +
                            "6. Exit.");

                    System.out.print("Moi ban nhap lua chon: ");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Vui long nhap so");
                }
            }

            switch (choose) {
                case 1: {
                    employeeManagement.menuEmployeeManagement();
                    break;
                }
                case 2: {
                    customerManagement.menuCustomerManagement();
                    break;
                }
                case 3: {
                    facilityManagement.menuFacilityManagement();
                    break;
                }
                case 4: {
                    bookingManagement.menuBookingManagement();
                    break;
                }
                case 5: {
                    promotionManagement.menuPromotionManagement();
                    break;
                }
                case 6: {
                    System.exit(0);
                }
            }
        } while (true);
    }
}


