import java.text.DecimalFormat;
import java.util.Scanner;

public class BillCalculator {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main (String[] args) {
        Bill bill = new Bill();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of units for your bill");
        int units = scanner.nextInt();
        for (int i = 1; i <= units; i++) {
            if(i <= 100) {
                bill.incrementBelowOneHundred();
            }
            else {
                bill.incrementOverOneHundred();
            }
        }
        System.out.println("Total bill: " + df2.format(bill.getTotal()));
    }
}
