package org.shapes;
import java.util.Objects;
/**
 * Quad class describes a two-dimensional figure square
 * @author Shalaiev Ivan
 * @version 1.0.0 30.08.2023
 */
public class Quad extends Shape implements Perimeter, Aria, DiagonalLength {
    private int pointOneX;
    private int pointOneY;
    private int pointTwoX;
    private int pointTwoY;
    public Quad(int pointOneX, int pointOneY, int pointTwoX, int pointTwoY) {
        this.pointOneX = pointOneX;
        this.pointOneY = pointOneY;
        this.pointTwoX = pointTwoX;
        this.pointTwoY = pointTwoY;
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
    /**
    Return class name
     */
    @Override
    public void name() {
        System.out.println("Quad");
    }
    @Override
    public double diagonalLength() {
        return Math.sqrt(Math.pow((pointTwoY - pointOneY), 2) + Math.pow((pointTwoX - pointOneX), 2));
    }
    @Override
    public double perimeter() {
        return 2 * Math.sqrt(2) * diagonalLength();
    }
    @Override
    public double aria() {
        return Math.pow(diagonalLength(), 2) / 2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Quad quad = (Quad) obj;
        return pointOneX == quad.pointOneX && pointOneY == quad.pointOneY && pointTwoX == quad.pointTwoX && pointTwoY == quad.pointTwoY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointOneX, pointOneY, pointTwoX, pointTwoY);
    }

    @Override
    public String toString() {
        return "Quad " + "\n" +
                "pointOneX " + pointOneX + "\n" +
                "pointOneY " + pointOneY + "\n" +
                "pointTwoX " + pointTwoX + "\n" +
                "pointTwoY " + pointTwoY;
    }
}
