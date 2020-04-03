package ex2;

import java.lang.Math;

public class Circle extends Form{
    public float radius;

    public Circle() {
        super();
        this.radius = 0f;
    }

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle: " +
                super.toString();
    }

    public void printCircleDimensions() {
        System.out.println("radius = " +
                this.radius);
    }

    @Override
    public void printDimensions() {
        printCircleDimensions();
    }

}
