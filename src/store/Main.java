package store;

import store.products.electronics.*;

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
        //smartphone.show();

        Computer computer = new Computer();
        DataSheetComputer dataSheetComputer = new DataSheetComputer();
        smartphone.setDescription("супер пупер компьютер");
        smartphone.setGuaranteePeriod(365);
        computer.setId("comp4654");
        computer.setName("asus");
        computer.setPrice(256.25);
        computer.setQuantity(546544);
        computer.show();

    }
}
