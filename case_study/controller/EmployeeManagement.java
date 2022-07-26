package case_study.controller;

import case_study.serviece.IEmployeeService;
import case_study.serviece.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeManagement {
    private Scanner scanner = new Scanner(System.in);
    private IEmployeeService iEmployeeService = new EmployeeService();

    public void menuEmployeeManagement() {
        do {
            System.out.println("Employee Management: \n" +
                    "Please choose!\n" +
                    "1. Display list employees  \n" +
                    "2. Add new employee \n" +
                    "3. Edit employee \n" +
                    "4. Return main menu.");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                   iEmployeeService.display();
                    break;
                case 2:
                   iEmployeeService.add();
                    break;
                case 3:
                    iEmployeeService.edit();
                    break;
                case 4:
                    return;
            }
        } while (true);

    }

}

