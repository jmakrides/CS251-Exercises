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
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }

    private double getRadius() {
        return radius;
    }

    private double getArea() {
        return 3.14 * (radius * radius);
    }
}
