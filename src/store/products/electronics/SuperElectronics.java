package store.products.electronics;

import store.products.Product;

public class SuperElectronics extends Product{
    private int guaranteePeriod;

    public SuperElectronics() {
        super();
    }

    public SuperElectronics(String id, String name, int quantity, String description, double price, int guaranteePeriod) {
        super(id, name, quantity, description, price);
        this.guaranteePeriod = guaranteePeriod;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("guaranteePeriod " + guaranteePeriod);
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(int guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }
}
