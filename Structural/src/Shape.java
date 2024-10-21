//Structural Adapter
// Shape.java
public interface Shape {
    void draw();
}
// Rectangle
class Rectangle {
    public void display() {
        System.out.println("Displaying a rectangle.");
    }
}
// RectangleAdaptera
class RectangleAdapter implements Shape {
    private Rectangle rectangle;

    public RectangleAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void draw() {
        rectangle.display();
    }
}

class Main {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle();

        // Use Rectangle via the Shape interface with the help of the adapter
        Shape shape = new RectangleAdapter(rectangle);

        // Draw the shape
        shape.draw(); // Outputs: Displaying a rectangle.
    }
}

