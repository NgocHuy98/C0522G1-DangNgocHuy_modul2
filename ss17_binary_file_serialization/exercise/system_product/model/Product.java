package ss17_binary_file_serialization.exercise.system_product.model;

import java.io.Serializable;

public  class  Product implements Serializable {
    private int id;
    private String name;
    private String manufacturer;
    private double price;
    private String dateOfManufacture;
    private String expiry;

    public Product() {
    }

    public Product(int id, String name, String manufacturer, double price, String dateOfManufacture, String expiry) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.dateOfManufacture = dateOfManufacture;
        this.expiry = expiry;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s \n", this.getId(), this.getName(), this.getManufacturer(), this.getPrice(),
                this.getDateOfManufacture(), this.getExpiry());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    @Override
    public String toString() {
        return
                "id = " + id +
                ", name = " + name  +
                ", manufacturer = " + manufacturer  +
                ", price = " + price +
                ", dateOfManufacture = " + dateOfManufacture  +
                ", expiry = " + expiry ;
    }
}
