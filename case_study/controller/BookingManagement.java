package case_study.controller;

import case_study.serviece.IBookingService;
import case_study.serviece.IContractService;
import case_study.serviece.impl.BookingService;

import java.util.Scanner;

public class BookingManagement {

    private Scanner scanner = new Scanner(System.in);
    private IBookingService iBookingService = new BookingService();
    private IContractService iContractService=new BookingService();

    public void menuBookingManagement() {
        do {
            int choose;
            while (true) {
                try {
                    System.out.println("Booking Management (Quan ly dat cho): \n" +
                            "Please choose (Vui long chon)!\n" +
                            "1. Add new booking (Them dat cho) \n" +
                            "2. Display list booking (Danh sach dat cho)  \n" +
                            "3. Create new contracts (Tao hop dong moi)\n" +
                            "4. Display list contracts (Hien thi hop dong) \n" +
                            "5. Edit contracts (Chinh sua hop dong) \n" +
                            "6. Return main menu (Tro ve giao dien).");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Vui long nhap so");
                }
            }

            switch (choose) {
                case 1:
                    iBookingService.add();
                    break;
                case 2:
                    iBookingService.display();
                    break;
                case 3:
                    iContractService.create();
                    break;
                case 4:
                    iContractService.displayContracts();
                    break;
                case 5:
                    iContractService.edit();
                    break;
                case 6:
                    return;
            }
        } while (true);

    }

}

