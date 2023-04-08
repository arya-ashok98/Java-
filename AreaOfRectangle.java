import java.util.Scanner;

class Area {

		int length, breadth, area;

		public void setDim(int l, int b) {

			length = l;

			breadth = b;

			getArea(length, breadth);

		}

		public void getArea(int length, int breadth) {

			area = length * breadth;

			System.out.println("\nThe area of this rectangle is: "+area);

		}

}


public class AreaOfRectangle {

		public static void main(String args[]) {

			int length, breadth;

			Scanner sc = new Scanner(System.in);

			System.out.println("\nEnter the length: ");

			length = sc.nextInt();

			System.out.println("\nEnter the breadth: ");

			breadth = sc.nextInt();

			Area obj = new Area();

			obj.setDim(length, breadth);


	      }

}
	


