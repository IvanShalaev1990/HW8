package org.shapes;

import java.util.Objects;
/**
 * Quad class describes a two-dimensional figure right triangle
 * @author Shalaiev Ivan
 * @version 1.0.0 30.08.2023
 */
public class RightTriangle extends Shape implements Perimeter, Aria {
    private final int hypotenusesPointOneX;
    private int hypotenusesPointOneY;
    private int hypotenusesPointTwoX;
    private int hypotenusesPointTwoY;
    private int pointThreeX;
    private int pointThreeY;

    public RightTriangle(int hypotenusesPointOneX, int hypotenusesPointOneY, int hypotenusesPointTwoX, int hypotenusesPointTwoY) {
        this.hypotenusesPointOneX = hypotenusesPointOneX;
        this.hypotenusesPointOneY = hypotenusesPointOneY;
        this.hypotenusesPointTwoX = hypotenusesPointTwoX;
        this.hypotenusesPointTwoY = hypotenusesPointTwoY;
        this.pointThreeX = hypotenusesPointTwoX;
        this.pointThreeY = hypotenusesPointOneY;
    }

    public int getHypotenusesPointOneX() {
        return hypotenusesPointOneX;
    }

    public int getHypotenusesPointOneY() {
        return hypotenusesPointOneY;
    }

    public void setHypotenusesPointOneY(int hypotenusesPointOneY) {
        this.hypotenusesPointOneY = hypotenusesPointOneY;
    }

    public int getHypotenusesPointTwoX() {
        return hypotenusesPointTwoX;
    }

    public void setHypotenusesPointTwoX(int hypotenusesPointTwoX) {
        this.hypotenusesPointTwoX = hypotenusesPointTwoX;
    }

    public int getHypotenusesPointTwoY() {
        return hypotenusesPointTwoY;
    }

    public void setHypotenusesPointTwoY(int hypotenusesPointTwoY) {
        this.hypotenusesPointTwoY = hypotenusesPointTwoY;
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
        System.out.println("Right Triangle");
    }

    @Override
    public double aria() {
        return (legOneLength() * legTwoLength()) / 2;
    }

    @Override
    public double perimeter() {

        return hypotenuseLength() + legOneLength() + legTwoLength();
    }

    /**
     * Return hypotenuse length
     */
    public double hypotenuseLength() {
        return Math.sqrt(Math.pow((hypotenusesPointTwoY - hypotenusesPointOneY), 2) + Math.pow((hypotenusesPointTwoX - hypotenusesPointOneX), 2));
    }

    /**
     * Return sides length
     */
    public double legOneLength() {
        return Math.sqrt(Math.pow((hypotenusesPointTwoY - pointThreeY), 2) + Math.pow((hypotenusesPointTwoX - pointThreeX), 2));
    }

    /**
     * Return sides length
     */
    public double legTwoLength() {
        return Math.sqrt(Math.pow((pointThreeY - hypotenusesPointOneY), 2) + Math.pow((pointThreeX - hypotenusesPointOneX), 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        RightTriangle that = (RightTriangle) obj;
        return hypotenusesPointOneX == that.hypotenusesPointOneX && hypotenusesPointOneY == that.hypotenusesPointOneY && hypotenusesPointTwoX == that.hypotenusesPointTwoX && hypotenusesPointTwoY == that.hypotenusesPointTwoY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hypotenusesPointOneX, hypotenusesPointOneY, hypotenusesPointTwoX, hypotenusesPointTwoY);
    }

    @Override
    public String toString() {
        return "RightTriangle" + "\n" +
                "hypotenusesPointOneX " + hypotenusesPointOneX +"\n" +
                ", hypotenusesPointOneY " + hypotenusesPointOneY +"\n" +
                ", hypotenusesPointTwoX " + hypotenusesPointTwoX +"\n" +
                ", hypotenusesPointTwoY " + hypotenusesPointTwoY +"\n" +
                ", pointThreeX " + pointThreeX +"\n" +
                ", pointThreeY " + pointThreeY;
    }
}
