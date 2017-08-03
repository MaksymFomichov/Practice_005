package store.products.electronics;

public class Processor {
    private int cores;
    private int frequency;

    public Processor(int cores, int frequency) {
        this.cores = cores;
        this.frequency = frequency;
    }

    public void show() {
        System.out.println("   кол-во ядер:            " + cores + " шт.");
        System.out.println("   тактовая частота ядра:  " + frequency + " мГц");
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
}
