public class InterfaceColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1.1);
        shapes[1] = new Rectangle(2.2,3.3);
        shapes[2] = new Square(4.4);

        for (Shape shape : shapes) {
            if (shape instanceof  Square) {
                ((Square) shape).howToColor();
            } else if (shape instanceof Circle) {
                System.out.println(((Circle) shape).getRadius());
            } else if (shape instanceof Rectangle) {
                System.out.println(((Rectangle) shape).getArea());
            }
        }
    }
}
