package case_study.model;

public class Room extends Facility {
    private String freeService;

    public Room( String idService,String name, double area, double rentalCosts, int maxPeople, String type, String freeService) {
        super(idService,name, area, rentalCosts, maxPeople, type);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",this.getIdService() ,this.getName(), this.getArea(), this.getRentalCosts(), this.getMaxPeople(),
                this.getType(), this.getFreeService());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", freeService = " + freeService;
    }
}
