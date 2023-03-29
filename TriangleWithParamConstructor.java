import java.lang.Math;

public class TriangleWithParamConstructor {

	int side1, side2, side3;

      	static double area = 0, perimeter = 0, semiPer;

	public TriangleWithParamConstructor(int side1, int side2, int side3) {

		perimeter = side1 + side2 + side3;

		semiPer = perimeter/2;

		area = Math.sqrt(semiPer * (semiPer - side1) * (semiPer - side2) * (semiPer - side3));

 	}

	public static void main(String args[]) {

		TriangleWithParamConstructor triangle = new TriangleWithParamConstructor(3, 4, 5);

		System.out.println("\nThe Perimeter of the triangle is: "+perimeter+" units");

		System.out.println("\nThe Area of the triangle is: "+area+" sq.units");

	}

}

