package case_study.model;

public class Villa extends Facility {
    private String roomStandard;
    private double areaPool;
    private int floors;

    public Villa(String name, double area, double rentalCosts, int maxPeople, String type, String roomStandard, double areaPool, int floors) {
        super(name,area,rentalCosts,maxPeople,type);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", areaPool=" + areaPool +
                ", floors=" + floors +
                '}';
    }
}
