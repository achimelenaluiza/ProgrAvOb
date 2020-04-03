package ex2;

public abstract class Form {
    private String color;

    public Form() {
        this.color = "none";
    }

    public Form(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "color='" + color + "' area=" + getArea();
    }

    public float getArea() {
        return 0;
    }

    public abstract void printDimensions();

}
