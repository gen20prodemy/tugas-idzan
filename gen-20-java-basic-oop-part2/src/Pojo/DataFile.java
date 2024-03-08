package Pojo;

public class DataFile {
    private int id;
    private String name;
    protected int price;

    public DataFile(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String toString() {
        return id + " " + name + " " + price;
    }
}
