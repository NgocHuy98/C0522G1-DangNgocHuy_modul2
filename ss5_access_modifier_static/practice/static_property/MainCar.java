package ss5_access_modifier_static.practice.static_property;

public class MainCar {
        public static void main(String[] args) {

            Car car1 = new Car("chs","sag");
            car1.setName("Mazda 3");
            car1.setEngine("Skyactiv3");
            System.out.println(car1.display());
            System.out.println(Car.numberOfCars+"\n");

            Car car2 = new Car("chs","sag");
            car2.setName("Mazda 6");
            car2.setEngine("Skyactiv 6");
            System.out.println(car2.display());
            System.out.println(Car.numberOfCars);

        }
    }

