package Prototype;

import Prototype.Class.Circle;
import Prototype.Class.Rectangle;
import Prototype.Class.Shape;

import java.util.LinkedList;

public class Client {


    public static void main(String[] args) {
        LinkedList<Shape> shapes = new LinkedList<Shape>();

        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(10);
        circle.setRadius(25);

        shapes.add(circle);


        Circle circle2 = (Circle) circle.clone();

        shapes.add(circle2);


        Rectangle rectangle = new Rectangle();
        rectangle.setX(10);
        rectangle.setY(10);
        rectangle.setWidth(25);
        rectangle.setHeight(25);
        shapes.add(rectangle);

        LinkedList<Shape> shapesCopy = new LinkedList<Shape>();
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

    }


}
