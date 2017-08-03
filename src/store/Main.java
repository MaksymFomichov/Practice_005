package store;

import store.products.electronics.*;

public class Main {

    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        DataSheetSmartphone dsPhone = new DataSheetSmartphone();
        dsPhone.setOperatingSystem("Android");
        dsPhone.setScreenDiagonal(25.1);
        dsPhone.setWorkingHours(24);
        dsPhone.setRam(new Ram(2048, "DDD5"));
        dsPhone.setProcessor(new Processor(10,1256));
        phone.setDataSheetSmartphone(dsPhone);
        phone.setDescription("супер пупер смартфоне на андроид");
        phone.setGuaranteePeriod(365);
        phone.setId("smart4654");
        phone.setName("sony");
        phone.setPrice(256.25);
        phone.setQuantity(546544);
        phone.show();

        Computer comp = new Computer();
        DataSheetComputer dsComp = new DataSheetComputer();
        dsComp.setVideoCard(new VideoCard(8, 1024, new Ram(256, "DDR4")));
        dsComp.setProcessor(new Processor(25,5896));
        dsComp.setRam(new Ram(1024,"DDR3"));
        comp.setDataSheetComputer(dsComp);
        comp.setDescription("супер пупер компьютер");
        comp.setGuaranteePeriod(365);
        comp.setId("comp4654");
        comp.setName("asus");
        comp.setPrice(1000);
        comp.setQuantity(100);
        comp.show();

    }
}
