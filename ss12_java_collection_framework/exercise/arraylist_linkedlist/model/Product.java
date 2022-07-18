package ss12_java_collection_framework.exercise.arraylist_linkedlist.model;

public class Product {
    private String name;
    private int id;
    private double price;

    public Product(){
    }

    public Product(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                " ID = " + id +
                ", name = " + name  +
                ", price = " + price ;
    }
}
