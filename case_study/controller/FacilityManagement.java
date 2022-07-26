package case_study.controller;


import case_study.serviece.IFacilityService;

import case_study.serviece.impl.FacilityService;

import java.util.Scanner;

public class FacilityManagement {

        private Scanner scanner = new Scanner(System.in);
        private IFacilityService iFacilityService = new FacilityService();

    public void menuFacilityManagement() {
            do {
                System.out.println("Facility Management: \n" +
                        "Please choose!\n" +
                        "1. Display list facility  \n" +
                        "2. Add new facility \n" +
                        "3. Display list facility maintenance \n" +
                        "4. Return main menu.");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        iFacilityService.display();
                        break;
                    case 2:
                        iFacilityService.add();
                        break;
                    case 3:
                        iFacilityService.displayMaintenance();
                        break;
                    case 4:
                        return;
                }
            } while (true);

        }
    }

