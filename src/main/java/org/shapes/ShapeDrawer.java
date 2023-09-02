package org.shapes;
/**
 * ShapeDrawer class which accepts a figure and outputs its name.
 *
 * @author Shalaiev Ivan
 * @version 1.0.0 30.08.2023
 */
public class ShapeDrawer {
    private Shape shape;

    public ShapeDrawer(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }
    public void name(){
        shape.name();
    }
}
