package ss10_list.bt_them.controller;

import ss10_list.bt_them.service.IOToService;
import ss10_list.bt_them.service.IXeTaiService;
import ss10_list.bt_them.service.IXemayService;
import ss10_list.bt_them.service.impl.OToService;
import ss10_list.bt_them.service.impl.XeMayService;
import ss10_list.bt_them.service.impl.XeTaiService;

import java.util.Scanner;

public class PhuongTienCanThem {
    private Scanner scanner = new Scanner(System.in);
    private IOToService iOtoService=new OToService() ;
    private IXeTaiService iXeTaiService=new XeTaiService();
    private IXemayService iXemayService=new XeMayService();

    public void danhSachThem() {
        do{
            System.out.println("Moi ban chon: \n"+
                    "1. Them moi xe tai \n" +
                    "2. Them moi xe o to \n" +
                    "3. Them moi xe may \n" +
                    "4. Quay ve menu chinh.");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iXeTaiService.addXeTai();
                    break;
                case 2:
                    iOtoService.addOTo();
                    break;
                case 3:
                    iXemayService.addXeMay();
                    break;
                case 4:
                    return;
            }
        } while (true);




    }
}
