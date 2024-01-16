package bilets.GeometricShapes;

public class ShapeFactory {
    public static Shape createShape(Shapes shape, double... args) {
        switch (shape) {
            case CIRCLE:
                return new Circle(args[0]);
            case RECTANGLE:
                return new Rectangle(args[0], args[1]);
            default:
                throw new IllegalArgumentException("Неизвестная фигура");
        }
    }

    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape(Shapes.CIRCLE, 5);
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Периметр круга: " + circle.getPerimeter());

        Shape rectangle = ShapeFactory.createShape(Shapes.RECTANGLE, 5, 10);
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());
    }
}
