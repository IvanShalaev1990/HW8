package org.shapes;

import java.util.Objects;

public class Point extends Shape{
    private int pointX;
    private int pointY;

    public Point(int pointX, int pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public int getPointX() {
        return pointX;
    }

    public void setPointX(int pointX) {
        this.pointX = pointX;
    }

    public int getPointY() {
        return pointY;
    }

    public void setPointY(int pointY) {
        this.pointY = pointY;
    }
    /**
     * Return class name
     */
    @Override
    public void name() {
        System.out.println("Point");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return pointX == point.pointX && pointY == point.pointY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    @Override
    public String toString() {
        return "Point" + "\n" +
                "pointX=" + pointX + "\n" +
                ", pointY=" + pointY;
    }
}
