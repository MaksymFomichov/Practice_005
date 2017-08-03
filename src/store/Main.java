package store;

import store.products.electronics.DataSheetSmartphone;
import store.products.electronics.Processor;
import store.products.electronics.Ram;
import store.products.electronics.Smartphone;

public class Main {

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        DataSheetSmartphone dataSheetSmartphone = new DataSheetSmartphone();
        dataSheetSmartphone.setOperatingSystem("Android");
        dataSheetSmartphone.setScreenDiagonal(25.1);
        dataSheetSmartphone.setWorkingHours(24);
        dataSheetSmartphone.setRam(new Ram(2048, "DDD5"));
        dataSheetSmartphone.setProcessor(new Processor(10,1256));
        smartphone.setDataSheetSmartphone(dataSheetSmartphone);
        smartphone.setDescription("супер пупер смартфоне на андроид");
        smartphone.setGuaranteePeriod(365);
        smartphone.setId("smart4654");
        smartphone.setName("sony");
        smartphone.setPrice(256.25);
        smartphone.setQuantity(546544);
        smartphone.show();
    }
}
