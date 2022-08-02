package case_study.serviece.impl;

import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;
import case_study.serviece.AreaInvalidException;
import case_study.serviece.DuplicateIDException;
import case_study.serviece.IFacilityService;
import case_study.serviece.ServiceStandardException;
import case_study.utils.ReadAndWriteFileFacility;

import java.util.*;

public class FacilityService implements IFacilityService {
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH_HOUSE = "case_study/data/house.csv";
    private static final String PATH_VILLA = "case_study/data/villa.csv";
    private static final String PATH_ROOM = "case_study/data/room.csv";



    @Override
    public void display() {
        Map<Facility, Integer> villaList = ReadAndWriteFileFacility.readFacilities(PATH_VILLA);
        System.out.println("== Danh sach Villa ==");
        for (Facility villa : villaList.keySet()) {
            System.out.println(villa + ", So lan su dung: " + villaList.get(villa));
        }

        Map<Facility, Integer> houseList = ReadAndWriteFileFacility.readFacilities(PATH_HOUSE);
        System.out.println("== Danh sach House ==");
        for (Facility house : houseList.keySet()) {
            System.out.println(house + ", So lan su dung: " + houseList.get(house));
        }

        Map<Facility, Integer> roomList = ReadAndWriteFileFacility.readFacilities(PATH_ROOM);
        System.out.println("== Danh sach Room ==");
        for (Facility room : roomList.keySet()) {
            System.out.println(room + ", So lan su dung: " + roomList.get(room));
        }

    }


    @Override
    public void displayMaintenance() {
        Map<Facility, Integer> villaList = ReadAndWriteFileFacility.readFacilities(PATH_VILLA);
        Set<Facility> keyVilla = villaList.keySet();
        for (Facility key : keyVilla) {
            if (villaList.get(key) >= 5) {
                System.out.printf("%s : %s\n", key, villaList.get(key));
            }
        }

        Map<Facility, Integer> houseList = ReadAndWriteFileFacility.readFacilities(PATH_HOUSE);
        Set<Facility> keyHouse = houseList.keySet();
        for (Facility key : keyHouse) {
            if (houseList.get(key) >= 5) {
                System.out.printf("%s : %s\n", key, houseList.get(key));
            }
        }

        Map<Facility, Integer> roomList = ReadAndWriteFileFacility.readFacilities(PATH_ROOM);
        Set<Facility> keyRoom = roomList.keySet();
        for (Facility key : keyRoom) {
            if (roomList.get(key) >= 5) {
                System.out.printf("%s : %s\n", key, roomList.get(key));
            }
        }
    }

    @Override
    public void addVilla() {
        Map<Facility, Integer> villaList = ReadAndWriteFileFacility.readFacilities(PATH_VILLA);
        Villa villa = getInfoVilla(villaList);
        villaList.put(villa, 0);
        System.out.println("Them moi thanh cong !!!\n" + villa);
        ReadAndWriteFileFacility.writeFileFacility(PATH_VILLA, villaList);
    }


    @Override
    public void addHouse() {
        Map<Facility, Integer> houseList = ReadAndWriteFileFacility.readFacilities(PATH_HOUSE);
        House house = getInfoHouse(houseList);
        houseList.put(house, 0);
        System.out.println("Them moi thanh cong !!!\n" + house);
        ReadAndWriteFileFacility.writeFileFacility(PATH_HOUSE, houseList);
    }

    @Override
    public void addRoom() {
        Map<Facility, Integer> roomList = ReadAndWriteFileFacility.readFacilities(PATH_ROOM);
        Room room = getInfoRoom(roomList);
        roomList.put(room, 0);
        System.out.println("Them moi thanh cong !!!\n" + room);
        ReadAndWriteFileFacility.writeFileFacility(PATH_ROOM, roomList);
    }

    public static Villa getInfoVilla(Map<Facility, Integer> villaList) {
        String idService;
        while (true) {
            try {
                idService = setIdService(villaList);
                if (!idService.matches("SVVL-\\d{4}")) {
                    throw new ServiceStandardException("Ma dich vu phai dung dinh dang: SVVL-YYYY, voi YYYY la cac so tu 0-9");
                }
                break;
            } catch (ServiceStandardException e) {
                System.out.println(e.getMessage());
            }

        }


        System.out.println("Nhap ten");
        String name = formatName();

        System.out.println("Nhap dien tich:");
        double area = setArea();

        double rentalCosts = setRentalCosts();

        int maxPeople = setMaxpeople();

        String type = setType();

        System.out.println("Nhap tieu chuan phong");
        String rooStandard = formatName();

        System.out.println("Nhap dien tich ho boi");
        double areaPool = setArea();

        int floor = setFloor();

        return new Villa(idService, name, area, rentalCosts, maxPeople, type, rooStandard, areaPool, floor);

    }

    public static Room getInfoRoom(Map<Facility, Integer> roomList) {
        String idService;
        while (true) {
            try {
                idService = setIdService(roomList);
                if (!idService.matches("SVRO-\\d{4}")) {
                    throw new ServiceStandardException("Ma dich vu phai dung dinh dang: SVRO-YYYY, voi YYYY la cac so tu 0-9");
                }
                break;
            } catch (ServiceStandardException e) {
                System.out.println(e.getMessage());
            }
        }


        System.out.println("Nhap ten");
        String name = formatName();

        System.out.println("Nhap dien tich:");
        double area = setArea();

        double rentalCosts = setRentalCosts();

        int maxPeople = setMaxpeople();

        String type = setType();

        System.out.println("Nhap dich vu mien phi di kem");
        String freeService = formatName();

        return new Room(idService, name, area, rentalCosts, maxPeople, type, freeService);

    }

    public static House getInfoHouse(Map<Facility, Integer> houseList) {
        String idService;
        while (true) {
            try {
                idService = setIdService(houseList);
                if (!idService.matches("SVHO-\\d{4}")) {
                    throw new ServiceStandardException("Ma dich vu phai dung dinh dang: SVHO-YYYY, voi YYYY la cac so tu 0-9");
                }
                break;
            } catch (ServiceStandardException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Nhap ten");
        String name = formatName();

        System.out.println("Nhap dien tich:");
        double area = setArea();

        double rentalCosts = setRentalCosts();

        int maxPeople = setMaxpeople();

        String type = setType();

        System.out.println("Nhap tieu chuan phong");
        String rooStandard = formatName();

        int floor = setFloor();





        return new House(idService, name, area, rentalCosts, maxPeople, type, rooStandard, floor);


    }

    public static String setIdService(Map<Facility, Integer> facilityIntegerMap) {

        String idService;

        while (true) {
            try {
                System.out.print("Nhap ma dich vu: ");
                idService = scanner.nextLine();
                for (Facility facility : facilityIntegerMap.keySet()) {
                    if (facility.getIdService().equals(idService)) {
                        throw new DuplicateIDException("Trung ma dich vu!!!");
                    }
                }
                break;

            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }

        }
        return idService;
    }

    public static String formatName() {
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

    public static double setArea() {
        double area;
        while (true) {
            try {
                area = Double.parseDouble(scanner.nextLine());
                if (area < 30) {
                    throw new AreaInvalidException("Dien tich phai lon hon 30m2, vui long nhap lai!");
                }
                break;
            } catch (AreaInvalidException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so");
            }
        }
        return area;

    }

    public static double setRentalCosts() {
        double rentalCosts;
        while (true) {
            try {
                System.out.println("Nhap chi phi thue");
                rentalCosts = Double.parseDouble(scanner.nextLine());
                if (rentalCosts < 0) {
                    throw new AreaInvalidException("Chi phi thue phai lon hon 0, vui long nhap lai!");
                }
                break;
            } catch (AreaInvalidException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so");
            }
        }
        return rentalCosts;

    }

    public static int setMaxpeople() {
        int maxpeople;
        while (true) {
            try {
                System.out.println("Nhap so nguoi toi da");
                maxpeople = Integer.parseInt(scanner.nextLine());
                if (maxpeople <= 0 || maxpeople >= 20) {
                    throw new AreaInvalidException("So nguoi toi da phai lon hon 0 va nho hon 20, vui long nhap lai!");
                }
                break;
            } catch (AreaInvalidException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so");
            }
        }
        return maxpeople;

    }

    public static String setType() {
        do {
            int choose;
            while (true) {

                try {
                    System.out.println("Chon kieu thue: \n" +
                            "1. Nam\n" +
                            "2. Thang\n" +
                            "3. Ngay \n" +
                            "4. Gio ");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Vui long nhap so");
                }
            }

            switch (choose) {
                case 1:
                    return "Nam";
                case 2:
                    return "Thang";
                case 3:
                    return "Ngay";
                case 4:
                    return "gio";
            }

        } while (true);

    }

    public static int setFloor() {
        int floor;
        while (true) {
            try {
                System.out.println("Nhap so tang");
                floor = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so");
            }
        }
        return floor;
    }

}



