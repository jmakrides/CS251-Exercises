import java.util.Scanner;

public class PrintArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of items you wish to enter into the array: ");
        int numItems = scanner.nextInt();

        int[] items = new int[numItems];
        System.out.println("Please enter the value of all items (separated by spaces): ");
        for(int i = 0; i < numItems; i++) {
            int currentInt = scanner.nextInt();
            items[i] = currentInt;
        }
        System.out.println("The values are: ");
        for (int item : items) {
            System.out.println(item);
        }
    }

}
