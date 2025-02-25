package oop1.ex;

public class Rectangle {
    int width = 0;
    int height = 0;

    Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}
