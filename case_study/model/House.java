package case_study.model;

public class House extends Facility  {
    private String roomStandard;
    private int floors;

    public House(String idService,String name, double area, double rentalCosts,
                 int maxPeople, String type, String roomStandard, int floors) {
        super(idService,name, area, rentalCosts, maxPeople, type);
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

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s", this.getIdService(),this.getName(), this.getArea(), this.getRentalCosts(), this.getMaxPeople(),
                this.getType(), this.getRoomStandard(), this.getFloors());
    }

    @Override
    public String toString() {
        return super.toString()+
                ", roomStandard = " + roomStandard +
                ", floors = " + floors;
    }
}
