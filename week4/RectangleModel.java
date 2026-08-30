
class Rectangle {

    private double width;
    private double height;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double side) {
        this(side, side);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }

    public void scale(double factor) {
        width = width * factor;
        height = height * factor;
    }

    public String toString() {
        return "Rectangle[" + width + " x " + height + "]";
    }
}
public class RectangleModel {

    public static void main(String[] args) {
        Rectangle unit = new Rectangle();
        Rectangle square = new Rectangle(5.0);
        Rectangle rect = new Rectangle(3.0, 4.0);

        System.out.println(unit);
        System.out.println(square);
        System.out.println(rect);

        System.out.println("Area of rect = " + rect.getArea());
        System.out.println("Perimeter of rect = " + rect.getPerimeter());
        System.out.println("Is square? " + square.isSquare());

        rect.scale(2.0);
        System.out.println("After scale(2.0): " + rect);
    }
}
