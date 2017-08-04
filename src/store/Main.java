package store;

import store.products.clothes.Brand;
import store.products.clothes.Clothes;
import store.products.electronics.*;
import store.products.food.*;

public class Main {

    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        DataSheetSmartphone dsPhone = new DataSheetSmartphone();
        dsPhone.setOperatingSystem("Android");
        dsPhone.setScreenDiagonal(25.1);
        dsPhone.setWorkingHours(24);
        dsPhone.setRam(new Ram(2048, "DDD5"));
        dsPhone.setProcessor(new Processor(10, 1256));
        phone.setDataSheetSmartphone(dsPhone);
        phone.setDescription("супер пупер смартфоне на андроид");
        phone.setGuaranteePeriod(365);
        phone.setId("smart4654");
        phone.setName("sony");
        phone.setPrice(256.25);
        phone.setQuantity(546544);
        //phone.show();

        Computer comp = new Computer();
        DataSheetComputer dsComp = new DataSheetComputer();
        dsComp.setVideoCard(new VideoCard(8, 1024, new Ram(256, "DDR4")));
        dsComp.setProcessor(new Processor(25, 5896));
        dsComp.setRam(new Ram(1024, "DDR3"));
        comp.setDataSheetComputer(dsComp);
        comp.setDescription("супер пупер компьютер");
        comp.setGuaranteePeriod(365);
        comp.setId("comp4654");
        comp.setName("asus");
        comp.setPrice(1000);
        comp.setQuantity(100);
        //comp.show();

        Vegetables vegetables = new Vegetables();
        vegetables.setExpirationDate(new ExpirationDate("25.12.2017", 5, 30));
        vegetables.setId("veg4654");
        vegetables.setName("помидор");
        vegetables.setPrice(2);
        vegetables.setQuantity(31);
        vegetables.setDescription("супер пупер помидор");
        vegetables.setBrand("синеглазка");
        //vegetables.show();

        Sweets sweets = new Sweets();
        sweets.setExpirationDate(new ExpirationDate("31.01.2001", 15, 60));
        sweets.setId("swe4654");
        sweets.setName("печенька");
        sweets.setPrice(25);
        sweets.setQuantity(301);
        sweets.setDescription("супер пупер печенька");
        //sweets.show();

        SweetDrinks sweetDrinks = new SweetDrinks();
        sweetDrinks.setExpirationDate(new ExpirationDate("1.05.2011", 2, 160));
        sweetDrinks.setId("swed4654");
        sweetDrinks.setName("кола");
        sweetDrinks.setPrice(2.5);
        sweetDrinks.setQuantity(500);
        sweetDrinks.setDescription("супер пупер газировка");
        //sweetDrinks.show();

        DrinkingWater drinkingWater = new DrinkingWater();
        drinkingWater.setId("dw4654");
        drinkingWater.setName("боржоми");
        drinkingWater.setPrice(0.5);
        drinkingWater.setQuantity(100);
        drinkingWater.setDescription("вода минирелаьная");
        //drinkingWater.show();

        Clothes clothes = new Clothes();
        clothes.setId("cl4654");
        clothes.setName("пиджак");
        clothes.setPrice(500);
        clothes.setQuantity(10);
        clothes.setDescription("супер пиджак");
        clothes.setBrand(new Brand("1985", "armani", 200, 50));
        clothes.show();

    }
}
