package com.company;

public class RectangleTest4 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4);
       // Rectangle rectangle = new Rectangle();
        rectangle.setWidth(-3);
        rectangle.setHeight(-4);
        System.out.println("Alan: " + rectangle.getArea());
        System.out.println("Çevre: " + rectangle.getPerimeter());
    }

}

