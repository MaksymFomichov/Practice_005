package store.products.electronics;

public class Processor {
    private int cores;
    private int frequency;

    public Processor() {
    }

    public Processor(int cores, int frequency) {
        this.cores = cores;
        this.frequency = frequency;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void show() {
        System.out.println("cores " + cores);
        System.out.println("frequency " + frequency);
    }
}
