import java.util.Scanner;

public class Circle {

    private double radius;
    private String colour;

    private Circle() {
        radius = 1.8;
        colour = "red";
    }

    private Circle(double radius) {
        this.radius = radius;
        colour = "red";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a radius for the circle:");
        double userRadius = scanner.nextDouble();
        Circle circle = new Circle(userRadius);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }

    private double getRadius() {
        return radius;
    }

    private double getArea() {
        return 3.14 * (radius * radius);
    }

    private void setColour(double d) {
        if (d < 10) {
            colour = "red";
        }
        else if (d >= 10 && d < 50) {
            colour = "amber";
        }
        else {
            colour = "green";
        }
    }
}
