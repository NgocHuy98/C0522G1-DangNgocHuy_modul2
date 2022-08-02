package case_study.controller;

import case_study.serviece.IFacilityService;
import case_study.serviece.impl.FacilityService;

import java.util.Scanner;

public class MenuFacility {
    Scanner scanner = new Scanner(System.in);
    IFacilityService iFacilityService = new FacilityService();
    public  void menuFacility(){

        do {
            int choose;
            while (true) {
                try {
                    System.out.println("Facility Management: \n" +
                            "Please choose!\n" +
                            "1. Add New Villa  \n" +
                            "2. Add New House\n" +
                            "3. Add New Room \n" +
                            "4. Return main menu.");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Vui long nhap so");
                }
            }

            switch (choose) {
                case 1:
                    iFacilityService.addVilla();
                    break;
                case 2:
                    iFacilityService.addHouse();
                    break;
                case 3:
                    iFacilityService.addRoom();
                    break;
                case 4:
                    return;
            }
        } while (true);

    }
}
