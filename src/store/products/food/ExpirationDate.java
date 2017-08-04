package store.products.food;

public class ExpirationDate {
    private String dateDanufacture;
    private double storageTemperature;
    private int expirationDate;

    public ExpirationDate(String dateDanufacture, double storageTemperature, int expirationDate) {
        this.dateDanufacture = dateDanufacture;
        this.storageTemperature = storageTemperature;
        this.expirationDate = expirationDate;
    }

    public void show(){
        System.out.println(" дата производства:        " + dateDanufacture);
        System.out.println(" температура хранения:     " + storageTemperature + " градусов");
        System.out.println(" срок годности:            " + expirationDate + " дней");
    }

    public String getDateDanufacture() {
        return dateDanufacture;
    }

    public void setDateDanufacture(String dateDanufacture) {
        this.dateDanufacture = dateDanufacture;
    }

    public double getStorageTemperature() {
        return storageTemperature;
    }

    public void setStorageTemperature(double storageTemperature) {
        this.storageTemperature = storageTemperature;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }
}
