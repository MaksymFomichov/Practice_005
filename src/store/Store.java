package store;

import store.products.Product;
import store.users.SubscriptionManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store extends SubscriptionManager {
    private double purse;
    private int typeProducts;
    private List<Product> clothes = new ArrayList<>();
    private List<Product> computers = new ArrayList<>();
    private List<Product> smartphones = new ArrayList<>();
    private List<Product> drinkingWaters = new ArrayList<>();
    private List<Product> sweetDrinks = new ArrayList<>();
    private List<Product> sweets = new ArrayList<>();
    private List<Product> vegetables = new ArrayList<>();

    public void startMenu() {
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
                searchName(smartphones, findNameProducts());
                break;
            case 2:
                searchName(computers, findNameProducts());
                break;
            case 3:
                searchName(vegetables, findNameProducts());
                break;
            case 4:
                searchName(sweets, findNameProducts());
                break;
            case 5:
                searchName(drinkingWaters, findNameProducts());
                break;
            case 6:
                searchName(sweetDrinks, findNameProducts());
                break;
            case 7:
                searchName(clothes, findNameProducts());
                break;
            case 8:
                startMenu();
                break;
            default:
                System.out.println("Неверный выбор, повторите попытку!");
                break;
        }
    }

    private void searchName(List<Product> list, String name) {
        if (name.equals("0")) {
            selectCategory();
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (name.equals(list.get(i).getName())) {
                    list.get(i).show();
                    System.out.println();
                    searchName(list, findNameProducts());
                    break;
                }
            }
            System.out.println("Товар с таким именем не найден!");
            System.out.println();
            searchName(list, findNameProducts());
        }
    }

    private String findNameProducts() {
        System.out.println("Введите имя искомого продукта или 0 для выхода в предыдущее меню:");
        return new Scanner(System.in).nextLine();
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

    public List<Product> getClothes() {
        return clothes;
    }

    public void setClothes(List<Product> clothes) {
        this.clothes = clothes;
    }

    public List<Product> getComputers() {
        return computers;
    }

    public void setComputers(List<Product> computers) {
        this.computers = computers;
    }

    public List<Product> getSmartphones() {
        return smartphones;
    }

    public void setSmartphones(List<Product> smartphones) {
        this.smartphones = smartphones;
    }

    public List<Product> getDrinkingWaters() {
        return drinkingWaters;
    }

    public void setDrinkingWaters(List<Product> drinkingWaters) {
        this.drinkingWaters = drinkingWaters;
    }

    public List<Product> getSweetDrinks() {
        return sweetDrinks;
    }

    public void setSweetDrinks(List<Product> sweetDrinks) {
        this.sweetDrinks = sweetDrinks;
    }

    public List<Product> getSweets() {
        return sweets;
    }

    public void setSweets(List<Product> sweets) {
        this.sweets = sweets;
    }

    public List<Product> getVegetables() {
        return vegetables;
    }

    public void setVegetables(List<Product> vegetables) {
        this.vegetables = vegetables;
    }
}
