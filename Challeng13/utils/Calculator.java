package Challeng13.utils;

import Challeng13.geometry.Circle;
import Challeng13.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        Rectangle rectangle = new Rectangle(6,7);

        double areaC = circle.radius * circle.radius;
        double areaR = rectangle.length * rectangle.breadth;
        System.out.println(areaR + " " + areaC);
    }
}
