package Inheritance.shape;

public class Rectangle extends Shape{
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int area() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(2,3);
        rect.display();
        System.out.println(rect.area());
    }
}
