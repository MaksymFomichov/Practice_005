package store.products.electronics;

public class Computer extends SuperElectronics{
   private DataSheetComputer dataSheetComputer;

   public Computer(){
       super();
   }

    @Override
    public void show(){
       super.show();
       dataSheetComputer.show();
    }

    public DataSheetComputer getDataSheetComputer() {
        return dataSheetComputer;
    }

    public void setDataSheetComputer(DataSheetComputer dataSheetComputer) {
        this.dataSheetComputer = dataSheetComputer;
    }
}
