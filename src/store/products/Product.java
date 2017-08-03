package store.products;

public class Product {
    private String id;
    private String name;
    private int quantity;
    private String description;
    private double price;

    public Product() {
    }

    public Product(String id, String name, int quantity, String description, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.description = description;
        this.price = price;
    }

    public void show() {
        System.out.println("------------ОБЩИЕ ДАННЫЕ--------------------------------------------------");
        System.out.println(" id:                       " + id);
        System.out.println(" название:                 " + name);
        System.out.println(" кол-во:                   " + quantity + " шт.");
        System.out.println(" описание:                 " + description);
        System.out.println(" цена:                     " + price + " уе");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
