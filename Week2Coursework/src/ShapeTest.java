public class ShapeTest {

    public static void main (String[] args) {
        /*The shape abstract class is used here to create an instance of the circle class. This is then proven by
        * using methods from both the abstract super class 'Shape' and the subclass 'Circle' */
        Shape s1 = new Circle(3.0, "red", true);
        System.out.println("Circle Radius: " + ((Circle) s1).getRadius());
        System.out.println("Circle Colour: " + s1.getColour()); //Method from abstract superclass
        System.out.println("Circle Filled: " + s1.isFilled()); //Method from abstract superclass
        System.out.println("Circle Area: " + s1.getArea()); //Overridden method from abstract superclass
        System.out.println("Circle Perimeter: " + s1.getPerimeter()); //Overridden method from abstract superclass
        System.out.println("Circle details: " + s1.toString()); //Overridden method from abstract superclass

        System.out.println();

        /*The shape abstract class is used here to create an instance of the rectangle class. This is then proven by
         * using methods from both the abstract super class 'Shape' and the subclass 'Rectangle' */
        Shape s2 = new Rectangle(3.0, 4.0, "Blue", false);
        System.out.println("Rectangle width :" + ((Rectangle) s2).getWidth());
        System.out.println("Rectangle length: " + ((Rectangle) s2).getLength());
        System.out.println("Rectangle colour: " + s2.getColour()); //Method from abstract superclass
        System.out.println("Rectangle filled: " + s2.isFilled()); //Method from abstract superclass
        System.out.println("Rectangle area: " + s2.getArea()); //Overridden method from abstract superclass
        System.out.println("Rectangle perimeter: " + s2.getPerimeter()); //Overridden method from abstract superclass
        System.out.println("Rectangle details: " + s2.toString()); //Overridden method from abstract superclass

        System.out.println();

        /*The shape abstract class is used here to create an instance of the square class. This is then proven by
         * using methods from the abstract super class 'Shape', superclass 'Rectangle' and the subclass 'Square' */
        Shape s3 = new Square(5.0, "Green", true);
        System.out.println("Square side: " + ((Square) s3).getSide());
        System.out.println("Square area: " + s3.getArea()); //Overridden method from abstract superclass defined in 'Rectangle' superclass
        System.out.println("Square perimeter: " + s3.getPerimeter()); //Overridden method from abstract superclass defined in 'Rectangle' superclass
        System.out.println("Square length: " + ((Square) s3).getLength());
        System.out.println("Square width: " + ((Square) s3).getWidth());
        System.out.println("Square colour: " + s3.getColour()); //Method from abstract superclass
        System.out.println("Square filled: " + s3.isFilled()); //Method from abstract superclass
        ((Square) s3).setSide(6.0); //Using set side changes both the length and width to 6.0
        System.out.println("Square area after change: " + s3.getArea()); //Overridden method from abstract superclass defined in 'Rectangle' superclass
        System.out.println("Square perimeter after change: " + s3.getPerimeter()); //Overridden method from abstract superclass defined in 'Rectangle' superclass
        System.out.println("Square details: " + s3.toString()); //Overridden method from abstract superclass

    }
}
