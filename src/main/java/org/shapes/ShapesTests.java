package org.shapes;

public class ShapesTests {
    public static void main(String[] args) {
        Quad quad = new Quad(1, 1, 10, 10);
        RightTriangle rightTriangle = new RightTriangle(10, 10, 1, 1);
        Rectangle rectangle = new Rectangle(1, 1, 10, 10);
        rightTriangle.name();
        System.out.println(rightTriangle.legTwoLength());
        System.out.println(rightTriangle.legOneLength());
        System.out.println(rightTriangle.hypotenuseLength());
        System.out.println(rightTriangle.perimeter());
        System.out.println(rightTriangle.aria());
        rectangle.name();
        System.out.println(rectangle.sideOneLength());
        System.out.println(rectangle.sideTwoLength());
        System.out.println(rectangle.diagonalLength());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.aria());
    }
}
