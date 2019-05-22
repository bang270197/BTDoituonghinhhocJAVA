package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        Shape shape1=new Shape("RED",false);
        System.out.println(shape1);

        Circle circle=new Circle();
        System.out.println(circle);

        Circle circle1=new Circle(3.5,"indigo",false);
        System.out.println(circle);

        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle);

        Rectangle rectangle1 =new Rectangle(2.3,5.8);
        System.out.println(rectangle1);

        Rectangle rectangle2 =new Rectangle(2.5,3.8,"OREANGE",true);
        System.out.println(rectangle2);


        Square square=new Square();
        System.out.println(square);

        square=new Square(2.3);
        System.out.println(square);

        square=new Square(5.8,"yellow",true);
        System.out.println(square);
        }


    }

