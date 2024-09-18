class Rectangle {
    int length;
    int width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int Area() {
        return length * width;
    }

    public int Perimeter() {
        return 2 * (length+width);
    }
}

public class RectangleMain{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5,4);
        System.out.println("Area of Rectangle: " + rect.Area());
        System.out.println("Perimeter of Rectangle: " + rect.Perimeter());
    }
}
