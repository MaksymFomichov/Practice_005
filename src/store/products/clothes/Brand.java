package store.products.clothes;

public class Brand {
    private String yearFoundation;
    private String name;
    private int numberEmployees;
    private int numberCountries;

    public Brand(String yearFoundation, String name, int numberEmployees, int numberCountries) {
        this.yearFoundation = yearFoundation;
        this.name = name;
        this.numberEmployees = numberEmployees;
        this.numberCountries = numberCountries;
    }

    public void show() {
        System.out.println(" год основания:            " + yearFoundation);
        System.out.println(" название:                 " + name);
        System.out.println(" кол-во работников:        " + numberEmployees);
        System.out.println(" кол-во стран:             " + numberCountries);
    }

    public String getYearFoundation() {
        return yearFoundation;
    }

    public void setYearFoundation(String yearFoundation) {
        this.yearFoundation = yearFoundation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    public int getNumberCountries() {
        return numberCountries;
    }

    public void setNumberCountries(int numberCountries) {
        this.numberCountries = numberCountries;
    }
}
