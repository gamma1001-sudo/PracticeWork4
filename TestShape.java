public class TestShape {

    public static void main(String[] args) {

        Shape s1 = new Circle(5.5, "RED", false);

        System.out.println(s1);
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());
        System.out.println("Color: " + s1.getColor());
        System.out.println("Filled: " + s1.isFilled());

        Circle c1 = (Circle) s1;

        System.out.println(c1);
        System.out.println("Radius: " + c1.getRadius());

        Shape s2 = new Rectangle(2.0, 4.0, "BLUE", true);

        System.out.println(s2);
        System.out.println("Area: " + s2.getArea());

        Rectangle r1 = (Rectangle) s2;

        System.out.println("Length: " + r1.getLength());

        Shape s3 = new Square(6.0, "GREEN", true);

        System.out.println(s3);
        System.out.println("Area: " + s3.getArea());

        Square sq1 = (Square) s3;

        System.out.println("Side: " + sq1.getSide());
    }
}