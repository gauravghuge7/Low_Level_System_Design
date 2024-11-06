package  items;

public class CD implements LibraryItems {

    private String title;
    private String uniqueId;
    private double value;

    private string artist

    public CD() {
    }

    public CD(String title, String uniqueId, double value, string artist) {
        this.title = title;
        this.uniqueId = uniqueId;
        this.value = value;
        this.artist = artist;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public double getValue() {
        return value;
    }

    public string getArtist() {
        return artist;
    }

    public  double calculateLateFees(int days) {
        return days * 10;
    }
}