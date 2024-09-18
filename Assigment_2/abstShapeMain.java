abstract class Shape {
    abstract void draw();
}
class Circle extends Shape {
    int radius;
    Circle(int radius) {
        this.radius = radius;
    }
    void draw() {
        System.out.println("Circle");
    }
}

class Rectangle extends Shape {
    int length;
    Rectangle(int length) {
        this.length = length;
    }
    void draw() {
        System.out.println("Rectangle");
    }
}


public class abstShapeMain {
    public static void main(String[] args) {
        System.out.println("Dynamic dispatch method by strong reference of circle in Shape type Variable");
        Shape circle = new Circle(5);
        circle.draw();

        System.out.println("\nDynamic dispatch method by strong reference of Rectangle in Shape type Variable");
        Shape rectangle = new Rectangle(5);
        rectangle.draw();
    }
}
