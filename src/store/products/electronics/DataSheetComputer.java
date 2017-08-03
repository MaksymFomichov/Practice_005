package store.products.electronics;

public class DataSheetComputer extends SuperDataSheet {
    private VideoCard videoCard;

    public DataSheetComputer() {
    }

    @Override
    public void show(){
        super.show();
        System.out.println(" видео карта:");
        System.out.println("  процессор:");
        videoCard.show();
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }
}
