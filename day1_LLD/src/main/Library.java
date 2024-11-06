

public class Library {


    private LibraryItems[] items;

    public  Library(LibraryItems[] items) {
        this.items = items;
    }




    /**
     *   Calcullate the late fees of the library items
     */


    public double calculateTotalValue(){
        double totalValue = 0;

        for(LibraryItems item : items) {
            totalValue += item.getValue();
        }

        return totalValue;
    }

}