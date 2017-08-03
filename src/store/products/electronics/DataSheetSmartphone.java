package store.products.electronics;

public class DataSheetSmartphone extends SuperDataSheet {
    private String operatingSystem;
    private double screenDiagonal;
    private int workingHours;

    public DataSheetSmartphone() {
    }

    public DataSheetSmartphone(Ram ram, Processor processor, String operatingSystem, double screenDiagonal, int workingHours) {
        super(ram, processor);
        this.operatingSystem = operatingSystem;
        this.screenDiagonal = screenDiagonal;
        this.workingHours = workingHours;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public void show() {
        super.show();
        System.out.println("operatingSystem " + operatingSystem);
        System.out.println("screenDiagonal " + screenDiagonal);
        System.out.println("workingHours " + workingHours);
    }
}
