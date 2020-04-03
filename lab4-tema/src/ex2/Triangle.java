package ex2;

import java.util.Objects;

public class Triangle extends Form{

    public float height;
    public float base;

    public Triangle() {
        super();
        this.base = 0f;
        this.height = 0f;
    }

    public Triangle(String color, float height, float base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public float getArea() {
        return height * base / 2;
    }

    @Override
    public String toString() {
        return "Triangle: " +
                super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Float.compare(triangle.height, height) == 0 &&
                Float.compare(triangle.base, base) == 0;
    }

    public void printTraingleDimensions() {
        System.out.println("height = " +
                this.height + " base = " + this.base);
    }

    @Override
    public void printDimensions() {
        printTraingleDimensions();
    }
}
