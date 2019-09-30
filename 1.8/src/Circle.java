import java.util.Scanner;

public class Circle {

    private double radius;
    private String colour;

    public Circle() {
        radius = 1.8;
        colour = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        colour = "red";
    }

    private Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a radius for the circle:");
        double userRadius = scanner.nextDouble();
        System.out.println("Please enter a number to define colour");
        String userColour = setColour(scanner.nextDouble());
        Circle circle = new Circle(userRadius, userColour);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.getColour());
    }

    private double getRadius() {
        return radius;
    }

    private double getArea() {
        return 3.14 * (radius * radius);
    }

    private String getColour() {
        return colour;
    }

    private static String setColour(double d) {
        String colour;

        if (d >= 0 && d <= 5) {
            colour = "red";
        }
        else if (d >= 6 && d <= 10) {
            colour = "amber";
        }
        else if (d >= 11 && d <= 15){
            colour = "green";
        }
        else if (d >= 16 && d <= 20){
            colour = "blue";
        }
        else if (d >= 21 && d <= 25){
            colour = "yellow";
        }
        else {
            colour = "purple";
        }

        return colour;
    }
}
