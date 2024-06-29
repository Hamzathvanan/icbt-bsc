package org.example;

public class Rectangle {
    public double length;
    public double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public int area(int length, int width) {
        return (int) (length * width);
    }

    public double perimeter() {
        return 2 * length + width;
    }
}
