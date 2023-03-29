package com.company;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        System.out.println("Yapımlanıyor...");
    }
    public Rectangle() {
        this(1,1);
    }

    public int getArea() {
        return  width * height;
    }
    public int getPerimeter() {
        return 2 * (width+height);
    }

    public void setWidth(int width) {
        if(width < 0) {
            this.width = -width;
        } else {
            this.width = width;
        }

    }

    public void setHeight(int height) {
        if(height < 0) {
            throw new IllegalArgumentException("Yükseklik pozitif olmalıdır " + height);
        }
        this.height = height;

    }
}
