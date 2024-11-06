
package main.LateFeesCalculate;

public interface LibraryItems extends LateFeesCalculate {

   String getTitle();

   String getUniqueId();

   double calculateLateFees(int days);

   double getValue();

}
