package _Module2_java._12JavaCollectionFramework.exercise.e1;

public class Product {
    private String id;
    private String name;
    private Double price;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product () {}

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }


    @Override
    public String toString() {
        return "Product {" +
                "id = '" + id + '\'' +
                ", name = '" + name + '\'' +
                ", price = " + price +
                '}';
    }
}
