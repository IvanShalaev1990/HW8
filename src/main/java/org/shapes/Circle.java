package org.shapes;

import java.util.Objects;

/**
 * {@inheritDoc}
 * Circle class describes a two-dimensional figure circle
 *
 * @author Shalaiev Ivan
 * @version 1.0.0 30.08.2023
 */
public class Circle extends Shape implements Perimeter, Aria {
    private int centerX;
    private int centerY;
    private int boundaryX;
    private int bounderyY;

    public Circle(int centerX, int centerY, int boundaryX, int bounderyY) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.boundaryX = boundaryX;
        this.bounderyY = bounderyY;
    }

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    public int getBoundaryX() {
        return boundaryX;
    }

    public void setBoundaryX(int boundaryX) {
        this.boundaryX = boundaryX;
    }

    public int getBounderyY() {
        return bounderyY;
    }

    public void setBounderyY(int bounderyY) {
        this.bounderyY = bounderyY;
    }

    /**
     * Return class name
     */
    @Override
    public void name() {
        System.out.println("Circle");
    }

    /**
     * Return radius length
     */
    public double radius() {
        return Math.sqrt(Math.pow((bounderyY - centerY), 2) + Math.pow((boundaryX - centerX), 2));
    }

    @Override
    public double aria() {
        return Math.PI * Math.pow(radius(), 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return centerX == circle.centerX && centerY == circle.centerY && boundaryX == circle.boundaryX && bounderyY == circle.bounderyY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(centerX, centerY, boundaryX, bounderyY);
    }

    @Override
    public String toString() {
        return "Circle " + "\n" +
                "centerX " + centerX + "\n" +
                ", centerY " + centerY + "\n" +
                ", boundaryX " + boundaryX + "\n" +
                ", bounderyY " + bounderyY;
    }
}
