package day5.abstractdemo;

import java.awt.*;

public class ShapeTest {
    public static void main(String[] args) {
        //Shape shape = new Shape();

        Shape shape = new Triangle();
        shape.draw();

        shape = new Circle();
        shape.draw();
    }
}
