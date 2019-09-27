import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Paradox {

    /*
    The process involves generating a random number between 1 and 365 (a birthday) and will loop for the number of people
    that will be in the room (n). If the randomly generated number matches a number that is already in the list then the loop
    will exit and the counter will be incremented. This counter keeps track of the number of times a matching birthday occured
    during the 1000 times the process was carried out. Probability is then calculated by dividing the count by the number of times the
    loop ran.
     */

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count = 0;
        double loops = 1000;
        ArrayList<Integer> birthdays = new ArrayList<>();

        System.out.println("Please enter the number of people in the room");
        int n = scanner.nextInt();

        for (int x = 0; x < loops; x++) {
            for (int i = 1; i < n; i++) {
                int birthday = getRandomNumber();
                if (birthdays.contains(birthday)) {
                    count++;
                    birthdays.clear();
                    break;
                }
                else {
                    birthdays.add(birthday);
                }
            }
        }

        System.out.println("count = " + count);
        double probability = count / loops;
        System.out.println("Probability: " + probability * 100 + "%");
    }

    private static int getRandomNumber() {
        int min = 1;
        int max = 365;
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
