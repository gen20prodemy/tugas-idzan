package Pojo;

public class ProductMap {
    protected int id;
    private String name;

   protected ProductMap(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // digunakan untuk menambah data baru
    public static ProductMap createProduct(int id, String name) {
        return new ProductMap(id, name);
    }
}
