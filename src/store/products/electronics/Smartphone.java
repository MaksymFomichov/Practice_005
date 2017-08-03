package store.products.electronics;

public class Smartphone extends SuperElectronics{
    private DataSheetSmartphone dataSheetSmartphone;

    public Smartphone() {
        super();
    }

    public Smartphone(String id, String name, int quantity, String description, double price, int guaranteePeriod) {
        super(id, name, quantity, description, price, guaranteePeriod);
    }

    public DataSheetSmartphone getDataSheetSmartphone() {
        return dataSheetSmartphone;
    }

    public void setDataSheetSmartphone(DataSheetSmartphone dataSheetSmartphone) {
        this.dataSheetSmartphone = dataSheetSmartphone;
    }

    @Override
    public void show(){
        super.show();
        dataSheetSmartphone.show();
    }
}
