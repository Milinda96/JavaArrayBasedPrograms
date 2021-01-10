package Factory;

public class ShapeFactory {
    public Shape getShape(String type) {
        if (type == null) {
            return null;
        } else if (type.equalsIgnoreCase("CIRCLE")) {
            return new Cicrle();
        } else if (type.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        } else {
            return null;
        }
    }
}