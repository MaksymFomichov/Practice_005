package store.products.food;

public class Vegetables extends SuperExpiration{
    private String brand;

    public Vegetables(){
        super();
    }

    @Override
    public void show(){
        super.show();
        System.out.println(" сорт:                     " + brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
