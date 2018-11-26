public class MyFirstProgram {

	public static void main(String[] args) {
		hello("Misha");
		hello("Lilia");
		double l = 5;
		System.out.println("Площадь квадрата со стороной " + l + " равна " + area(l));
		double a = 4;
		double b = 7;
		System.out.println("Площадь треугольника со сторонами a = " + a + " и b = " + b + " равна " + area(a,b));

	}
	public static void hello(String somebody){

		System.out.println("Hello " + somebody + "!");
	}
	public static double area(double l){
		return l * l;
	}
	public static double area(double a, double b){
		return a * b;
	}
}