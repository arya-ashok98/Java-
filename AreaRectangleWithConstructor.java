import java.util.Scanner;

class Area {

	int length, breadth, area;

	Area(int l, int b) {

		length = l;

		breadth = b;

	}

	public int returnArea() {

		int area = length * breadth;

		return area;

	}

}


public class AreaRectangleWithConstructor {
	
	public static void main(String[] args) {

		int l, b;

		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter the length: ");

		l = sc.nextInt();

		System.out.println("\nEnter the breadth: ");

		b = sc.nextInt();

		Area obj = new Area(l, b); //object creation for class Area with parameterised constructor

		System.out.println("\nThe area of the rectangle is: "+obj.returnArea());

	}

}

		