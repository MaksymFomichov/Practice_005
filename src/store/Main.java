package store;

import store.products.Product;
import store.products.clothes.Brand;
import store.products.clothes.Clothes;
import store.products.electronics.*;
import store.products.food.*;
import store.users.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Store store;

    public static void main(String[] args) {
        store = new Store();

        // заполняем начальные данные
        addUsers();
        addSmartphones();
        addComputers();
        addVegetables();
        addClothes();
        addDrinkingWaters();
        addSweetDrinks();
        addSweets();

        // запуск интрфейса через командную строку
        store.startMenu();
    }

    private static void addUsers() {
        store.addUser(new User("id001", "Максим", "m.fomichov@gmail.com", "12.01.2017", true));
        store.addUser(new User("id002", "Петр", "defun_android@ukr.net", "31.02.2017", true));
        store.addUser(new User("id003", "Алексей", "aleksey@gmail.com", "08.03.2017", false));
        store.addUser(new User("id004", "Егор", "egor@gmail.com", "04.04.2017", false));
        store.addUser(new User("id005", "Денис", "denis@gmail.com", "21.05.2017", false));
        store.addUser(new User("id006", "Александр", "alex@gmail.com", "17.06.2017", false));
        store.addUser(new User("id007", "Михаил", "miho@gmail.com", "11.07.2017", false));
    }

    private static void addSmartphones() {
        List<Product> smartphones = new ArrayList<>();

        Smartphone phone1 = new Smartphone();
        DataSheetSmartphone dsPhone1 = new DataSheetSmartphone();
        dsPhone1.setOperatingSystem("Android");
        dsPhone1.setScreenDiagonal(25.1);
        dsPhone1.setWorkingHours(24);
        dsPhone1.setRam(new Ram(2048, "DDD5"));
        dsPhone1.setProcessor(new Processor(10, 1256));
        phone1.setDataSheetSmartphone(dsPhone1);
        phone1.setDescription("супер пупер смартфоне на андроид");
        phone1.setGuaranteePeriod(365);
        phone1.setId("smart0001");
        phone1.setName("sony");
        phone1.setPrice(256.25);
        phone1.setQuantity(546544);

        Smartphone phone2 = new Smartphone();
        DataSheetSmartphone dsPhone2 = new DataSheetSmartphone();
        dsPhone2.setOperatingSystem("Android");
        dsPhone2.setScreenDiagonal(25.1);
        dsPhone2.setWorkingHours(24);
        dsPhone2.setRam(new Ram(2048, "DDD5"));
        dsPhone2.setProcessor(new Processor(10, 1256));
        phone2.setDataSheetSmartphone(dsPhone2);
        phone2.setDescription("супер пупер смартфоне на андроид");
        phone2.setGuaranteePeriod(365);
        phone2.setId("smart0002");
        phone2.setName("samsung");
        phone2.setPrice(256.25);
        phone2.setQuantity(546544);

        Smartphone phone3 = new Smartphone();
        DataSheetSmartphone dsPhone3 = new DataSheetSmartphone();
        dsPhone3.setOperatingSystem("Android");
        dsPhone3.setScreenDiagonal(25.1);
        dsPhone3.setWorkingHours(24);
        dsPhone3.setRam(new Ram(2048, "DDD5"));
        dsPhone3.setProcessor(new Processor(10, 1256));
        phone3.setDataSheetSmartphone(dsPhone3);
        phone3.setDescription("супер пупер смартфоне на андроид");
        phone3.setGuaranteePeriod(365);
        phone3.setId("smart0003");
        phone3.setName("oneplusone");
        phone3.setPrice(256.25);
        phone3.setQuantity(546544);

        smartphones.add(phone1);
        smartphones.add(phone2);
        smartphones.add(phone3);

        store.setSmartphones(smartphones);
    }

    private static void addComputers() {
        List<Product> computers = new ArrayList<>();

        Computer comp1 = new Computer();
        DataSheetComputer dsComp1 = new DataSheetComputer();
        dsComp1.setVideoCard(new VideoCard(8, 1024, new Ram(256, "DDR4")));
        dsComp1.setProcessor(new Processor(25, 5896));
        dsComp1.setRam(new Ram(1024, "DDR3"));
        comp1.setDataSheetComputer(dsComp1);
        comp1.setDescription("супер пупер компьютер");
        comp1.setGuaranteePeriod(365);
        comp1.setId("comp0001");
        comp1.setName("apple");
        comp1.setPrice(1000);
        comp1.setQuantity(100);

        Computer comp2 = new Computer();
        DataSheetComputer dsComp2 = new DataSheetComputer();
        dsComp2.setVideoCard(new VideoCard(8, 1024, new Ram(256, "DDR4")));
        dsComp2.setProcessor(new Processor(25, 5896));
        dsComp2.setRam(new Ram(1024, "DDR3"));
        comp2.setDataSheetComputer(dsComp2);
        comp2.setDescription("супер пупер компьютер");
        comp2.setGuaranteePeriod(365);
        comp2.setId("comp0002");
        comp2.setName("asus");
        comp2.setPrice(1000);
        comp2.setQuantity(100);

        Computer comp3 = new Computer();
        DataSheetComputer dsComp3 = new DataSheetComputer();
        dsComp3.setVideoCard(new VideoCard(8, 1024, new Ram(256, "DDR4")));
        dsComp3.setProcessor(new Processor(25, 5896));
        dsComp3.setRam(new Ram(1024, "DDR3"));
        comp3.setDataSheetComputer(dsComp3);
        comp3.setDescription("супер пупер компьютер");
        comp3.setGuaranteePeriod(365);
        comp3.setId("comp0003");
        comp3.setName("sony");
        comp3.setPrice(1000);
        comp3.setQuantity(100);

        computers.add(comp1);
        computers.add(comp2);
        computers.add(comp3);

        store.setComputers(computers);
    }

    private static void addVegetables() {
        List<Product> vegetables = new ArrayList<>();

        Vegetables tomato = new Vegetables();
        tomato.setExpirationDate(new ExpirationDate("05.02.2017", 2, 90));
        tomato.setId("veg0001");
        tomato.setName("помидор");
        tomato.setPrice(0.2);
        tomato.setQuantity(301);
        tomato.setDescription("супер пупер помидор");
        tomato.setBrand("желтенький");

        Vegetables pepper = new Vegetables();
        pepper.setExpirationDate(new ExpirationDate("12.06.2017", 5, 30));
        pepper.setId("veg0002");
        pepper.setName("перец");
        pepper.setPrice(20);
        pepper.setQuantity(121);
        pepper.setDescription("супер пупер перец");
        pepper.setBrand("острый");

        Vegetables cucumber = new Vegetables();
        cucumber.setExpirationDate(new ExpirationDate("11.05.2017", 10, 60));
        cucumber.setId("veg0003");
        cucumber.setName("огурец");
        cucumber.setPrice(7);
        cucumber.setQuantity(466);
        cucumber.setDescription("супер пупер огурец");
        cucumber.setBrand("длинный");

        vegetables.add(tomato);
        vegetables.add(pepper);
        vegetables.add(cucumber);

        store.setVegetables(vegetables);
    }

    private static void addClothes() {
        List<Product> clothes = new ArrayList<>();

        Clothes jacket = new Clothes();
        jacket.setId("c0001");
        jacket.setName("пиджак");
        jacket.setPrice(500);
        jacket.setQuantity(100);
        jacket.setDescription("супер пиджак");
        jacket.setBrand(new Brand("1886", "armani", 568, 786));

        Clothes pants = new Clothes();
        pants.setId("c0002");
        pants.setName("штаны");
        pants.setPrice(500);
        pants.setQuantity(50);
        pants.setDescription("супер штаны");
        pants.setBrand(new Brand("1946", "gucchi", 48, 510));

        Clothes tShirt = new Clothes();
        tShirt.setId("c0003");
        tShirt.setName("пиджак");
        tShirt.setPrice(500);
        tShirt.setQuantity(50000);
        tShirt.setDescription("супер футболка");
        tShirt.setBrand(new Brand("1979", "lenkombinat", 256987, 2));

        clothes.add(jacket);
        clothes.add(pants);
        clothes.add(tShirt);

        store.setClothes(clothes);
    }

    private static void addDrinkingWaters() {
        List<Product> drinkingWaters = new ArrayList<>();

        DrinkingWater borjomi = new DrinkingWater();
        borjomi.setId("dw0001");
        borjomi.setName("боржоми");
        borjomi.setPrice(5.5);
        borjomi.setQuantity(1000);
        borjomi.setDescription("вода минирелаьная соленная");

        DrinkingWater mirgorodska = new DrinkingWater();
        mirgorodska.setId("dw0002");
        mirgorodska.setName("миргородская");
        mirgorodska.setPrice(0.5);
        mirgorodska.setQuantity(500);
        mirgorodska.setDescription("вода минирелаьная лечебная");

        DrinkingWater luzhanska = new DrinkingWater();
        luzhanska.setId("dw0003");
        luzhanska.setName("лужанская");
        luzhanska.setPrice(1.5);
        luzhanska.setQuantity(600);
        luzhanska.setDescription("вода минирелаьная щелочная");

        drinkingWaters.add(borjomi);
        drinkingWaters.add(mirgorodska);
        drinkingWaters.add(luzhanska);
    }

    private static void addSweetDrinks() {
        List<Product> sweetDrinks = new ArrayList<>();

        SweetDrinks cola = new SweetDrinks();
        cola.setExpirationDate(new ExpirationDate("25.07.2016", 10, 460));
        cola.setId("swed0001");
        cola.setName("кола");
        cola.setPrice(0.5);
        cola.setQuantity(100);
        cola.setDescription("супер пупер кола");

        SweetDrinks fanta = new SweetDrinks();
        fanta.setExpirationDate(new ExpirationDate("10.05.2017", 5, 110));
        fanta.setId("swed0002");
        fanta.setName("кола");
        fanta.setPrice(2.4);
        fanta.setQuantity(550);
        fanta.setDescription("супер пупер фанта");

        SweetDrinks jivchik = new SweetDrinks();
        jivchik.setExpirationDate(new ExpirationDate("31.02.2017", 21, 60));
        jivchik.setId("swed0003");
        jivchik.setName("кола");
        jivchik.setPrice(5.5);
        jivchik.setQuantity(300);
        jivchik.setDescription("супер пупер живчик");

        sweetDrinks.add(cola);
        sweetDrinks.add(fanta);
        sweetDrinks.add(jivchik);

        store.setSweetDrinks(sweetDrinks);
    }

    private static void addSweets() {
        List<Product> sweets = new ArrayList<>();

        Sweets biscuit = new Sweets();
        biscuit.setExpirationDate(new ExpirationDate("29.05.2017", 15, 260));
        biscuit.setId("swe0001");
        biscuit.setName("печенька");
        biscuit.setPrice(25);
        biscuit.setQuantity(301);
        biscuit.setDescription("супер пупер печенька");

        Sweets candy = new Sweets();
        candy.setExpirationDate(new ExpirationDate("31.01.2017", 1, 160));
        candy.setId("swe0002");
        candy.setName("конфетка");
        candy.setPrice(25);
        candy.setQuantity(301);
        candy.setDescription("супер пупер конфетка");

        Sweets cake = new Sweets();
        cake.setExpirationDate(new ExpirationDate("01.02.2017", 5, 120));
        cake.setId("swe0003");
        cake.setName("тортик");
        cake.setPrice(25);
        cake.setQuantity(301);
        cake.setDescription("супер пупер тортик");

        sweets.add(biscuit);
        sweets.add(candy);
        sweets.add(cake);

        store.setSweets(sweets);
    }
}
