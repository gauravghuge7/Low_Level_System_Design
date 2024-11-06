

class lateFeesCalculator {


    public double totalCalculateLateFees(lateFeesCalculator[] items, int days) {
        double totalLateFee = 0;

        for(lateFeesCalculator item : items ) {
            totalLateFee +=  item.calculateLateFees();
        }

        return totalLateFee;
    }
}