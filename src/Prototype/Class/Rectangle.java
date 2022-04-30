package Prototype.Class;
// Prototipo concreto. El método de clonación crea un nuevo
// objeto y lo pasa al constructor. Hasta que el constructor
// termina, tiene una referencia a un nuevo clon. De este modo
// nadie tiene acceso a un clon a medio terminar. Esto garantiza
// la consistencia del resultado de la clonación.
public class Rectangle extends  Shape {
    private int width;
    private int height;

    public Rectangle() {
        super();
    }
    public Rectangle(Rectangle source) {
        // Para copiar campos privados definidos en la clase
        // padre es necesaria una llamada a un constructor
        super(source);
        this.height = source.height;
        this.width = source.width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
