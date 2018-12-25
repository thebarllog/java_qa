package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("Misha");
        hello("Lilia");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " равна " + s.area());


        Rectangle r = new Rectangle(4, 7);
        System.out.println("Площадь прямоугольника со сторонами a = " + r.a + " и b = " + r.b + " равна " + r.area());

        Point p1 = new Point(2, 3);
        Point p2 = new Point(6, 7);
        double d = p2.distance(p1);
        System.out.println("Расстояние между точками p1 (2, 3) и p2 (6, 7) равно " + d ) ;


    }


    public static void hello(String somebody) {

        System.out.println("Hello " + somebody + "!");
    }


}