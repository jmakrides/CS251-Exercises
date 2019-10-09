public class Square extends Rectangle{


    public Square() {}

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String colour, boolean filled) {
        super(side, side);
        setColour(colour);
        setFilled(filled);
    }

    public double getSide() {
        return length;
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", colour='" + colour + '\'' +
                ", filled=" + filled +
                '}';
    }
}
