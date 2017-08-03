package store.products.electronics;

public class VideoCard extends Processor{
    private Ram ram;

    public VideoCard(int cores, int frequency, Ram ram) {
        super(cores, frequency);
        this.ram = ram;
    }

    @Override
    public void show(){
        super.show();
        System.out.println("  оперативная память:");
        ram.show();
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }
}
