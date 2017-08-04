package store.products.food;

import store.products.Product;

public class SuperExpiration extends Product {
    private ExpirationDate expirationDate;

    public SuperExpiration() {
    }

    public SuperExpiration(String id, String name, int quantity, String description, double price, ExpirationDate expirationDate) {
        super(id, name, quantity, description, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public void show(){
        super.show();
        System.out.println("------------СРОК ГОДНОСТИ-------------------------------------------------");
        expirationDate.show();
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}
