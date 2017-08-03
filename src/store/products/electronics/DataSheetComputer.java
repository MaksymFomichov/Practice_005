package store.products.electronics;

public class DataSheetComputer extends SuperDataSheet {
    private VideoCard videoCard;

    public DataSheetComputer() {
    }

    public DataSheetComputer(Ram ram, Processor processor, VideoCard videoCard) {
        super(ram, processor);
        this.videoCard = videoCard;
    }

    @Override
    public void show(){
        super.show();
        videoCard.show();
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }
}
