package case_study.controller;

import case_study.serviece.IPromotionService;
import case_study.serviece.impl.PromotionService;

import java.util.Scanner;

public class PromotionManagement {

    private Scanner scanner = new Scanner(System.in);
    private IPromotionService iPromotionService = new PromotionService();

    public void menuPromotionManagement() {
        do {
            int choose;
            while (true) {
                try {
                    System.out.println("Employee Management: \n" +
                            "Please choose!\n" +
                            "1. Display list customers use service  \n" +
                            "2. Display list customers get voucher \n" +
                            "3. Return main menu.");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Vui long nhap so");
                }
            }

            switch (choose) {
                case 1:
                    iPromotionService.displayService();
                    break;
                case 2:
                    iPromotionService.displayVoucher();
                    break;
                case 3:
                    return;
            }
        } while (true);

    }
}

