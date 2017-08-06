package store;

import store.products.clothes.Clothes;
import store.products.electronics.Computer;
import store.products.electronics.Smartphone;
import store.products.food.DrinkingWater;
import store.products.food.SweetDrinks;
import store.products.food.Sweets;
import store.products.food.Vegetables;
import store.users.SubscriptionManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Store extends SubscriptionManager {
    private double purse;
    private int typeProducts;
    private ArrayList<Clothes> clothes = new ArrayList<>();
    private ArrayList<Computer> computers = new ArrayList<>();
    private ArrayList<Smartphone> smartphones = new ArrayList<>();
    private ArrayList<DrinkingWater> drinkingWaters = new ArrayList<>();
    private ArrayList<SweetDrinks> sweetDrinks = new ArrayList<>();
    private ArrayList<Sweets> sweets = new ArrayList<>();
    private ArrayList<Vegetables> vegetables = new ArrayList<>();

    public void startMenu(){
        System.out.println("Выберите действие:");
        System.out.println("1 - найти товар");
        System.out.println("2 - принять товар");
        System.out.println("3 - продать товар");
        System.out.println("4 - выход");

        switch (checkInt()) {
            case 1:
                selectCategory();
                break;
            case 2:
                System.out.println("Пока не работает");
                startMenu();
                break;
            case 3:
                System.out.println("Пока не работает");
                startMenu();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Неверный выбор, повторите попытку!");
                break;
        }
    }

    private void selectCategory() {
        System.out.println("Выберите категорию:");
        System.out.println("1 - смартфон");
        System.out.println("2 - компьютер");
        System.out.println("3 - овощи");
        System.out.println("4 - сладости");
        System.out.println("5 - питьевая вода");
        System.out.println("6 - сладкие напитки");
        System.out.println("7 - одежда");
        System.out.println("8 - вернуться в главное меню");

        switch (checkInt()) {
            case 1:
                typeProducts = 1;
                break;
            case 2:
                typeProducts = 2;
                break;
            case 3:
                typeProducts = 3;
                break;
            case 4:
                typeProducts = 4;
                break;
            case 5:
                typeProducts = 5;
                break;
            case 6:
                typeProducts = 6;
                break;
            case 7:
                typeProducts = 7;
                break;
            case 8:
                startMenu();
                break;
            default:
                System.out.println("Неверный выбор, повторите попытку!");
                break;
        }
        findNameProducts();
    }

    private void findNameProducts() {
        System.out.println("Введите имя продуката");
        String name = String.valueOf(new Scanner(System.in).nextLine());
        switch (typeProducts) {
            case 1:
                searchNameSmartphones(name);
                break;
            case 2:
                searchNameComputers(name);
                break;
            case 3:
                searchNameVegetables(name);
                break;
            case 4:
                searchNameSweets(name);
                break;
            case 5:
                searchNameDrinkingWaters(name);
                break;
            case 6:
                searchNameSweetDrinks(name);
                break;
            case 7:
                searchNameClothes(name);
                break;
        }
    }

    private void searchNameSmartphones(String name) {
        for (int i = 0; i < smartphones.size(); i++) {
            if(name.equals(smartphones.get(i).getName())){
                smartphones.get(i).show();
                break;
            } else {
                System.out.println("Товар с таким именем не найден!");
            }
        }
    }

    private void searchNameComputers(String name) {
    }

    private void searchNameSweets(String name) {
    }

    private void searchNameVegetables(String name) {
    }

    private void searchNameDrinkingWaters(String name) {
    }

    private void searchNameSweetDrinks(String name) {
    }

    private void searchNameClothes(String name) {
    }


    // проверяем на целое число
    private int checkInt() {
        Scanner sc = new Scanner(System.in);
        int value;
        while (true) {
            try {
                value = sc.nextInt();
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Только целое число!");
                sc.nextLine();
            }
        }
        return value;
    }

    public void setClothes(ArrayList<Clothes> clothes) {
        this.clothes = clothes;
    }

    public void setComputers(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    public void setSmartphones(ArrayList<Smartphone> smartphones) {
        this.smartphones = smartphones;
    }

    public void setDrinkingWaters(ArrayList<DrinkingWater> drinkingWaters) {
        this.drinkingWaters = drinkingWaters;
    }

    public void setSweetDrinks(ArrayList<SweetDrinks> sweetDrinks) {
        this.sweetDrinks = sweetDrinks;
    }

    public void setSweets(ArrayList<Sweets> sweets) {
        this.sweets = sweets;
    }

    public void setVegetables(ArrayList<Vegetables> vegetables) {
        this.vegetables = vegetables;
    }

    public ArrayList<Clothes> getClothes() {
        return clothes;
    }

    public ArrayList<Computer> getComputers() {
        return computers;
    }

    public ArrayList<Smartphone> getSmartphones() {
        return smartphones;
    }

    public ArrayList<DrinkingWater> getDrinkingWaters() {
        return drinkingWaters;
    }

    public ArrayList<SweetDrinks> getSweetDrinks() {
        return sweetDrinks;
    }

    public ArrayList<Sweets> getSweets() {
        return sweets;
    }

    public ArrayList<Vegetables> getVegetables() {
        return vegetables;
    }
}
