

public class DVD implements LibraryItems {


    private String title;
    private String uniqueId;
    private double value;
    private String artist;

    public DVD(String title, String uniqueId, double value, String artist) {
        this.title = title;
        this.uniqueId = uniqueId;
        this.value = value;
        this.artist = artist;
    }

    public DVD() {
    }


    public String getTitle() {
        return this.title;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public double getValue() {
        return this.value;
    }

    double calculateFees(int days) {
        days * 10;
    }

    public String getArtist() {
        return this.artist;
    }
}