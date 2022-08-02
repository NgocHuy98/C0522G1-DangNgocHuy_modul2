package case_study.model;

public abstract class Facility {
    private String idService;
    private String name;
    private double area;
    private double rentalCosts;
    private int maxPeople;
    private String type;

    public Facility() {
    }

    public Facility( String idService,String name, double area, double rentalCosts, int maxPeople, String type) {
        this.idService=idService;
        this.name = name;
        this.area = area;
        this.rentalCosts = rentalCosts;
        this.maxPeople = maxPeople;
        this.type = type;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return
                "id Service = " + idService +
                ", name = " + name +
                ", area = " + area +
                ", rentalCosts = " + rentalCosts +
                ", maxPeople = " + maxPeople +
                ", type = " + type ;
    }
}
