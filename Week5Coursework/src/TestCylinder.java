import java.util.Random;
import java.util.Scanner;

public class TestCylinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of cylinders you want to generate: ");
        int numberOfCylinders = (Integer.parseInt(scanner.nextLine()));
        long start = System.nanoTime();
        Cylinder[] cylinders = new Cylinder[numberOfCylinders];
        Random r = new Random();
        for(int i = 0; i < cylinders.length; i++) {
                Cylinder cylinder = new Cylinder();
                cylinder.setRadius(r.nextInt(50) + 1);
                cylinder.setHeight(r.nextInt(50) + 1);
                cylinders[i] = cylinder;
                int cylinderCounter = i + 1;
                System.out.println("Cylinder number " + cylinderCounter + " : " + cylinder.toString());
            }
        long end = System.nanoTime();
        System.out.println("The algorithm ran in " + (end - start) + " ns.");
    }

}
