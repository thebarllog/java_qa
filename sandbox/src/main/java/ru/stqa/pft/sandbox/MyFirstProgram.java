package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("Misha");
		hello("Lilia");

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " равна " + s.area());


		Rectangle r = new Rectangle(4, 7);
		System.out.println("Площадь треугольника со сторонами a = " + r.a + " и b = " + r.b + " равна " + r.area());

	}
	public static void hello(String somebody){

		System.out.println("Hello " + somebody + "!");
	}
}
