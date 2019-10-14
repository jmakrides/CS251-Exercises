import java.util.Scanner;

public class TestCylinder {

    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        System.out.println("Radius is " + cy1.getRadius()
                + " Height is " + cy1.getHeight()
                + " Color is " + cy1.getColor()
                + " Base area is " + cy1.getArea()
                + " Volume is " + cy1.getVolume());

        Cylinder cy2 = new Cylinder(5.0, 2.0);
        System.out.println("Radius is " + cy2.getRadius()
                + " Height is " + cy2.getHeight()
                + " Color is " + cy2.getColor()
                + " Base area is " + cy2.getArea()
                + " Volume is " + cy2.getVolume());

        Scanner scanner = new Scanner(System.in);
        Cylinder[][] cylinders = new Cylinder[4][25];
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 25; j++) {
                Cylinder cylinder = new Cylinder();
                System.out.println("Please enter the radius of the cylinder (double): ");
                cylinder.setRadius(Double.parseDouble(scanner.nextLine()));
                System.out.println("Please enter the height of the cylinder (double): ");
                cylinder.setHeight(Double.parseDouble(scanner.nextLine()));
                System.out.println("Please enter the colour of the cylinder: ");
                cylinder.setColor(scanner.nextLine());
                cylinders[i][j] = cylinder;
            }
        }

        int cylinderCounter = 0;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 25; j++) {
                cylinderCounter++;
                Cylinder cylinder = cylinders[i][j];
                System.out.println("Cylinder number " + cylinderCounter + " : " + cylinder.toString());
            }
        }
    }

}
