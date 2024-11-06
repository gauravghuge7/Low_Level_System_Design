

public class book implements LibraryItems {


    private String title;

    private String uniqueId;

    private String author;

    private double value;

    private book(String title, String uniqueId, String author, double value) {

        this.title = title;
        this.author = author;
        this.uniqueId = uniqueId;
        this.value = value;
    }


    public String getTitle() {
        return this.title;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public String getAuthor() {
        return this.author;
    }

    public double calculateLateFees(int days) {
        return days * 10;
    }

    public double getValue() {
        return this.value;
    }
}

