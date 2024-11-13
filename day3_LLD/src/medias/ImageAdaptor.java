package medias;

public class ImageAdaptor implements Media{

    private Image image;

    public ImageAdaptor(Image image) {
        this.image = image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public void play() {
        this.image.display();
    }
}
