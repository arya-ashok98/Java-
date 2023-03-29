public class RectangleAreaWithParam {

	static int length1 = 5, breadth1 = 4, length2 = 8, breadth2 = 5;

	static double area = 0;

	RectangleAreaWithParam(int length, int breadth) {

	Area(length, breadth);

	}

	public double Area(Integer length, Integer breadth) {

		area = length * breadth;
		return area;

	}

	public static void main(String[] args) {

		RectangleAreaWithParam rect1 = new RectangleAreaWithParam(length1, breadth1);

		System.out.println("\nThe area of the first rectangle is: "+area);

		RectangleAreaWithParam rect2 = new RectangleAreaWithParam(length2, breadth2);

		System.out.println("\nThe area of the first rectangle is: "+area);

	}

}
