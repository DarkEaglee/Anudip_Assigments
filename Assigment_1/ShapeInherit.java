class Shape {
    public double area(){
        System.out.println("Area");
        return 0 ;
    };
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double breadth;
    private double height;
    public Rectangle(double breadth, double height) {
        this.breadth = breadth;
        this.height = height;
    }

    public double area() {
        return breadth * height;
    }
}

class Square extends Shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }
}


public class ShapeInherit {
    public static void main(String args[]) {
        Shape circle = new Circle(2);
        Shape rectangle = new Rectangle(6, 3);
        Shape square = new Square(8);

        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Square: " + square.area());
    }
}
