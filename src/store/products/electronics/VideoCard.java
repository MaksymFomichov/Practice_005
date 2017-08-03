package store.products.electronics;

public class VideoCard extends Processor{
    private RamVideo ramVideo;

    public VideoCard() {
    }

    public VideoCard(int cores, int frequency, RamVideo ramVideo) {
        super(cores, frequency);
        this.ramVideo = ramVideo;
    }

    public RamVideo getRamVideo() {
        return ramVideo;
    }

    public void setRamVideo(RamVideo ramVideo) {
        this.ramVideo = ramVideo;
    }
}
