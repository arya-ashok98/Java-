import java.lang.Math;

public class TriangleWithNoParamConstructor {

	static int side1 = 3, side2 = 4, side3 = 5, perimeter;

      	static double area = 0.00, semiPer = 0.00;

      	public TriangleWithNoParamConstructor() {

		perimeter = side1 + side2 + side3;

		semiPer = perimeter/2;     //(side1 + side2 + side3)/2;

		area = Math.sqrt(semiPer * (semiPer - side1) * (semiPer - side2) * (semiPer - side3));

	}	


	public static void main(String args[]) {

		TriangleWithNoParamConstructor triangle = new TriangleWithNoParamConstructor();

		System.out.println("\nThe perimeter of the triangle is: "+perimeter+" units");

		System.out.println("\nThe area of the triangle is: "+area+" sq units");
	}

}
            
      
