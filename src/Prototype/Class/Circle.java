package Prototype.Class;

public class Circle extends  Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    public Circle(){
        super();
    }
    public Circle(Circle source) {
        // Para copiar campos privados definidos en la clase
        // padre es necesaria una llamada a un constructor
        super(source);
        this.radius = source.radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
