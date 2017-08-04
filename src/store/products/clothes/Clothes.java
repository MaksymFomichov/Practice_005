package store.products.clothes;

import store.products.Product;

public class Clothes extends Product{
    private Brand brand;

    public Clothes(){
        super();
    }

    @Override
    public void show(){
        super.show();
        System.out.println("------------БРЕНД---------------------------------------------------------");
        brand.show();
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
