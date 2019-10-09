public class Circle extends Shape{

    private double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String colour, boolean filled) {
        this.radius = radius;
        setColour(colour);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * (getRadius() * getRadius());
    }

    @Override
    public double getPerimeter() {
        return 3.14 * (getRadius() * 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                ", filled=" + filled +
                '}';
    }
}
