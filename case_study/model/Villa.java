package case_study.model;

public class Villa extends Facility {
    private String roomStandard;
    private double areaPool;
    private int floors;

    public Villa(String idService, String name, double area, double rentalCosts,
                 int maxPeople, String type, String roomStandard, double areaPool, int floors) {
        super(idService,name,area,rentalCosts,maxPeople,type);
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

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",this.getIdService(),this.getName(), this.getArea(), this.getRentalCosts(), this.getMaxPeople(),
                this.getType(), this.getRoomStandard(),this.getAreaPool(), this.getFloors() );
    }

    @Override
    public String toString() {
        return super.toString() +
                ", roomStandard = " + roomStandard +
                ", areaPool = " + areaPool +
                ", floors = " + floors;
    }
}
