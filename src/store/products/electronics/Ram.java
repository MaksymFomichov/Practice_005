package store.products.electronics;

public class Ram {
    private int volume;
    private String type;

    public Ram(int memoryVolume, String memoryType) {
        this.volume = memoryVolume;
        this.type = memoryType;
    }

    public void show() {
        System.out.println("   объем:                  " + volume + " Мбайт");
        System.out.println("   тип памяти:             " + type);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getMemoryType() {
        return type;
    }

    public void setMemoryType(String memoryType) {
        this.type = memoryType;
    }
}
