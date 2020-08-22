package com.company;

public class Rectangle {

    private int length;

    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int areaOfRectangle() {
        int area = length * width;
        return area;
    }

    public int perimeterOfRectangle() {
        int perimeter = 2 * (length + width);
        return perimeter;
    }

    public String toString() {
        return String.format("Length - %d, Width - %d, area - %d, perimeter - %d ",
                length, width, areaOfRectangle(), perimeterOfRectangle());
    }
}
