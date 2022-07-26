package case_study.model;

public class Room extends Facility {
    private String freeService;

    public Room(String name, double area, double rentalCosts, int maxPeople, String type, String freeService) {
        super(name, area, rentalCosts, maxPeople, type);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
