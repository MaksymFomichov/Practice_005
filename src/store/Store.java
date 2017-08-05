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

public class Store extends SubscriptionManager{
    private double purse;
    private ArrayList<Clothes> clothes = new ArrayList<>();
    private ArrayList<Computer> computers = new ArrayList<>();
    private ArrayList<Smartphone> smartphones = new ArrayList<>();
    private ArrayList<DrinkingWater> drinkingWaters = new ArrayList<>();
    private ArrayList<SweetDrinks> sweetDrinks = new ArrayList<>();
    private ArrayList<Sweets> sweets = new ArrayList<>();
    private ArrayList<Vegetables> vegetables = new ArrayList<>();

    public void selectCategory() {
        System.out.println("Выберите категорию:");
        System.out.println("1 - смартфон");
        System.out.println("2 - компьютер");
        System.out.println("3 - овощи");
        System.out.println("4 - сладости");
        System.out.println("5 - питьевая вода");
        System.out.println("6 - сладкие напитки");
        System.out.println("7 - одежда");

        switch (checkInt()) {
            case 1:
                break;
//            case 2:
//                searchName(computers);
//                break;
//            case 3:
//                searchName(vegetables);
//                break;
//            case 4:
//                searchName(sweets);
//                break;
//            case 5:
//                searchName(drinkingWaters);
//                break;
//            case 6:
//                searchName(sweetDrinks);
//                break;
//            case 7:
//                searchName(clothes);
//                break;
            default:
                System.out.println("Неверный выбор, повторите попытку!");
                break;
        }
    }

    private void searchNameSmartphone(ArrayList<Smartphone> smartphones) {
        for (int i = 0; i < smartphones.size(); i++) {
            System.out.println(smartphones.get(i).getName());
        }
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









    public double getPurse() {
        return purse;
    }

    public void setPurse(double purse) {
        this.purse = purse;
    }

    public ArrayList<Clothes> getClothes() {
        return clothes;
    }

    public void setClothes(ArrayList<Clothes> clothes) {
        this.clothes = clothes;
    }

    public ArrayList<Computer> getComputers() {
        return computers;
    }

    public void setComputers(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    public ArrayList<Smartphone> getSmartphones() {
        return smartphones;
    }

    public void setSmartphones(ArrayList<Smartphone> smartphones) {
        this.smartphones = smartphones;
    }

    public ArrayList<DrinkingWater> getDrinkingWaters() {
        return drinkingWaters;
    }

    public void setDrinkingWaters(ArrayList<DrinkingWater> drinkingWaters) {
        this.drinkingWaters = drinkingWaters;
    }

    public ArrayList<SweetDrinks> getSweetDrinks() {
        return sweetDrinks;
    }

    public void setSweetDrinks(ArrayList<SweetDrinks> sweetDrinks) {
        this.sweetDrinks = sweetDrinks;
    }

    public ArrayList<Sweets> getSweets() {
        return sweets;
    }

    public void setSweets(ArrayList<Sweets> sweets) {
        this.sweets = sweets;
    }

    public ArrayList<Vegetables> getVegetables() {
        return vegetables;
    }

    public void setVegetables(ArrayList<Vegetables> vegetables) {
        this.vegetables = vegetables;
    }
}
