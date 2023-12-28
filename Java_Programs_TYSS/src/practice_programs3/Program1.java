package practice_programs3;

public class Program1 {
	public static void areaOfCircle(int r) {
		System.out.println("Area of Circle:"+3.14*r*r);
	}
	public static void perimeterOfCircle(int r) {
		System.out.println("Perimeter of circle"+2*3.14*r);
	}
	public static void areaOfSquare(int r) {
		System.out.println("Area of Square:"+r*r);
	}
	public static void perimeterOfSquare(int r) {
		System.out.println("Perimeter of Square"+4*r);
	}
	public static void areaOfTriangle(int b,int h) {
		System.out.println("Area of Triangle:"+0.5*b*h);
	}
	public static void perimeterOfEquivalentTriangle(int l) {
		System.out.println("Perimeter of Equivalent Triangle:"+3*l);
	}
	public static void perimeterOfIsoscelesTriangle(int h,int b) {
		System.out.println("Perimeter of Isosceles Triangle:"+2*h+b);
	}
	public static void perimeterOfScaleneTriangle(int h,int b, int l) {
		System.out.println("Perimeter of Scalene Triangle:"+l+h+b);
	}
	public static void main(String[] args) {
		areaOfCircle(5);
		perimeterOfCircle(6);
		areaOfSquare(9);
		perimeterOfSquare(7);
		areaOfTriangle(6, 3);
		perimeterOfEquivalentTriangle(4);
		perimeterOfIsoscelesTriangle(9, 3);
		perimeterOfScaleneTriangle(6, 7, 4);
	}
}