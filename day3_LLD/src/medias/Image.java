package medias;

public class Image {

    private String fileName;

    public Image(String fileName) {
        this.fileName = fileName;
    }


    public void display() {
        System.out.println("Displaying Image : "+fileName);
    }
}
