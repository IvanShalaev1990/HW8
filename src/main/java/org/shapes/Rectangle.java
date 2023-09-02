package org.shapes;

import java.util.Objects;

/**
 * {@inheritDoc}
 * Rectangle class describes a two-dimensional figure rectangle
 *
 * @author Shalaiev Ivan
 * @version 1.0.0 30.08.2023
 */

public class Rectangle extends Shape implements Perimeter, Aria, DiagonalLength {
    private int pointOneX;
    private int pointOneY;
    private int pointTwoX;
    private int pointTwoY;
    private int pointThreeX;
    private int pointThreeY;

    public Rectangle(int pointOneX, int pointOneY, int pointTwoX, int pointTwoY) {
        this.pointOneX = pointOneX;
        this.pointOneY = pointOneY;
        this.pointTwoX = pointTwoX;
        this.pointTwoY = pointTwoY;
        this.pointThreeX = pointTwoX;
        this.pointThreeY = pointOneY;
    }

    public int getPointOneX() {
        return pointOneX;
    }

    public void setPointOneX(int pointOneX) {
        this.pointOneX = pointOneX;
    }

    public int getPointOneY() {
        return pointOneY;
    }

    public void setPointOneY(int pointOneY) {
        this.pointOneY = pointOneY;
    }

    public int getPointTwoX() {
        return pointTwoX;
    }

    public void setPointTwoX(int pointTwoX) {
        this.pointTwoX = pointTwoX;
    }

    public int getPointTwoY() {
        return pointTwoY;
    }

    public void setPointTwoY(int pointTwoY) {
        this.pointTwoY = pointTwoY;
    }

    public int getPointThreeX() {
        return pointThreeX;
    }

    public int getPointThreeY() {
        return pointThreeY;
    }

    /**
     * Return class name
     */
    @Override
    public void name() {
        System.out.println("Rectangle");
    }

    @Override
    public double diagonalLength() {
        return Math.sqrt(Math.pow((pointTwoY - pointOneY), 2) + Math.pow((pointTwoX - pointOneX), 2));
    }

    /**
     * Return sides length
     */
    public double sideOneLength() {
        return Math.sqrt(Math.pow((pointTwoY - pointThreeY), 2) + Math.pow((pointTwoX - pointThreeX), 2));
    }

    /**
     * Return sides length
     */
    public double sideTwoLength() {
        return Math.sqrt(Math.pow((pointThreeY - pointOneY), 2) + Math.pow((pointThreeX - pointOneX), 2));
    }

    @Override
    public double aria() {
        return sideOneLength() * sideTwoLength();
    }

    @Override
    public double perimeter() {
        return (sideOneLength() + sideTwoLength()) * 2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return pointOneX == rectangle.pointOneX && pointOneY == rectangle.pointOneY && pointTwoX == rectangle.pointTwoX && pointTwoY == rectangle.pointTwoY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointOneX, pointOneY, pointTwoX, pointTwoY);
    }

    @Override
    public String toString() {
        return "Rectangle" + "\n" +
                "pointOneX " + pointOneX + "\n" +
                ", pointOneY " + pointOneY + "\n" +
                ", pointTwoX " + pointTwoX + "\n" +
                ", pointTwoY " + pointTwoY + "\n" +
                ", pointThreeX " + pointThreeX + "\n" +
                ", pointThreeY " + pointThreeY;
    }
}
