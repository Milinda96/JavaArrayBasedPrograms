package Factory;

public class ShapeFactoryMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();
        System.out.println(Adder.add(1, 1));
        System.out.println(Adder.add(2.2, 2.5));
    }
}

class Adder {
    static int add(double a, double b) {
        return (int) (a + b);
    }
    static double add(int a, int b) {
        return (int) (a + b);
    }
}