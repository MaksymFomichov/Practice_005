package store.products.electronics;

public class Computer extends SuperElectronics{
   private DataSheetComputer dataSheetComputer;

   public Computer(){
       super();
   }

    public Computer(String id, String name, int quantity, String description, double price, int guaranteePeriod, DataSheetComputer dataSheetComputer) {
        super(id, name, quantity, description, price, guaranteePeriod);
        this.dataSheetComputer = dataSheetComputer;
    }

    public DataSheetComputer getDataSheetComputer() {
        return dataSheetComputer;
    }

    public void setDataSheetComputer(DataSheetComputer dataSheetComputer) {
        this.dataSheetComputer = dataSheetComputer;
    }
}
