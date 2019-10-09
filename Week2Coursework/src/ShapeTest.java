public class ShapeTest {

    public static void main (String[] args) {
        Shape s1 = new Circle(3, "red", true);
        System.out.println("Radius: " + s1.getArea());
        System.out.println("Colour: " + s1.getColour());
        System.out.println("Filled: " + s1.isFilled());
    }
}
