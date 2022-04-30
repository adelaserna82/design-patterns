package Prototype.Class;

// Prototipo base.
public abstract class Shape {
    private int X;
    private int Y;
    private String color;

    // Un constructor normal.
    public Shape(){

    }
    // El constructor prototipo. Un nuevo objeto se inicializa // con valores del objeto existente.
    public Shape(Shape source) {
        this();
        this.X = source.X;
        this.Y = source.Y;
        this.color = source.color;
    }

public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract Shape clone();
}
