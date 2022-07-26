package case_study.model;

public class House extends Facility{
    private String roomStandard;
    private int floors;

    public House(String name, double area, double rentalCosts, int maxPeople, String type, String roomStandard, int floors) {
        super(name, area, rentalCosts, maxPeople, type);
        this.roomStandard = roomStandard;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", floors=" + floors +
                '}';
    }
}
