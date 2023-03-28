import java.lang.Math;

public class Triangle {

	int side1 = 3, side2 = 4, side3 = 5, perimeter;

      	double area = 0.00, semiPer = 0.00;

      	public void calculatePerimeter() {

		perimeter = side1 + side2 + side3;

	      	System.out.println("\nThe perimeter of the triangle is: "+perimeter+" units");

	}

	public void calculateArea() {

		semiPer = perimeter/2;     //(side1 + side2 + side3)/2;

		area = Math.sqrt(semiPer * (semiPer - side1) * (semiPer - side2) * (semiPer - side3));

		System.out.println("\nThe area of the triangle is: "+area+" sq units");

	}	


	public static void main(String args[]) {

		Triangle triangle = new Triangle();

		triangle.calculatePerimeter();

		triangle.calculateArea();

	}

}
            
      
