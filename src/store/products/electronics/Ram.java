package store.products.electronics;

public class Ram {
    private int volume;
    private String type;

    public Ram() {
    }

    public Ram(int memoryVolume, String memoryType) {
        this.volume = memoryVolume;
        this.type = memoryType;
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


    public void show() {
        System.out.println("volume " + volume);
        System.out.println("type " + type);
    }
}
