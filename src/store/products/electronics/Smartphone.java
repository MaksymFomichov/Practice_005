package store.products.electronics;

public class Smartphone extends SuperElectronics {
    private DataSheetSmartphone dataSheetSmartphone;

    public Smartphone() {
        super();
    }

    @Override
    public void show() {
        super.show();
        dataSheetSmartphone.show();
    }

    public DataSheetSmartphone getDataSheetSmartphone() {
        return dataSheetSmartphone;
    }

    public void setDataSheetSmartphone(DataSheetSmartphone dataSheetSmartphone) {
        this.dataSheetSmartphone = dataSheetSmartphone;
    }


}
