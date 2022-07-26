package case_study.controller;

import case_study.serviece.IBookingService;
import case_study.serviece.impl.BookingService;
import case_study.serviece.impl.EmployeeService;

import java.util.Scanner;

public class BookingManagement {

        private Scanner scanner = new Scanner(System.in);
        private IBookingService iBookingService = new BookingService();

    public void menuBookingManagement() {
            do {
                System.out.println("Booking Management: \n" +
                        "Please choose!\n" +
                        "1. Add new booking \n" +
                        "2. Display list booking  \n" +
                        "3. Create new constracts\n" +
                        "4. Display list constracts  \n" +
                        "5. Edit constracts \n" +
                        "6. Return main menu.");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        iBookingService.add();
                        break;
                    case 2:
                        iBookingService.display();
                        break;
                    case 3:
                        iBookingService.creat();
                        break;
                        case 4:
                        iBookingService.displayConstracts();
                        break;
                        case 5:
                        iBookingService.edit();
                        break;
                    case 6:
                        return;
                }
            } while (true);

        }

    }

