
public class Rectangle extends Shape{

    protected double width;
    protected double length;

    public Rectangle() {}


    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String colour, boolean filled) {
        this.width = width;
        this.length = length;
        setColour(colour);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return getLength() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return (getWidth() * 2) + (getLength() * 2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", colour='" + colour + '\'' +
                ", filled=" + filled +
                '}';
    }
}
