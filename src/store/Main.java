package store;

import store.products.electronics.*;

public class Main {

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        DataSheetSmartphone dsPhone = new DataSheetSmartphone();
        dsPhone.setOperatingSystem("Android");
        dsPhone.setScreenDiagonal(25.1);
        dsPhone.setWorkingHours(24);
        dsPhone.setRam(new Ram(2048, "DDD5"));
        dsPhone.setProcessor(new Processor(10,1256));
        smartphone.setDataSheetSmartphone(dsPhone);
        smartphone.setDescription("супер пупер смартфоне на андроид");
        smartphone.setGuaranteePeriod(365);
        smartphone.setId("smart4654");
        smartphone.setName("sony");
        smartphone.setPrice(256.25);
        smartphone.setQuantity(546544);
        smartphone.show();

        Computer computer = new Computer();
        DataSheetComputer dsComp = new DataSheetComputer();
        dsComp.setVideoCard(new VideoCard(8, 1024, new RamVideo(256, "DDR4")));
        dsComp.setProcessor(new Processor(25,5896));
        dsComp.setRam(new Ram(1024,"DDR3"));
        computer.setDataSheetComputer(dsComp);
        computer.setDescription("супер пупер компьютер");
        computer.setGuaranteePeriod(365);
        computer.setId("comp4654");
        computer.setName("asus");
        computer.setPrice(1000);
        computer.setQuantity(100);
        computer.show();

    }
}
