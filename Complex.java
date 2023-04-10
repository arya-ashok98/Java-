import java.util.Scanner;

public class Complex {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter the first complex number");

		System.out.println("\nEnter the real part: ");

		int realPart1 = sc.nextInt();

		System.out.println("\nEnter the imaginary part: ");

		int imgPart1 = sc.nextInt();

		System.out.println("\nThe first complex number is: "+realPart1+"+"+"i"+imgPart1);

		System.out.println("\nEnter the second complex number");

		System.out.println("\nEnter the real part: ");

		int realPart2 = sc.nextInt();

		System.out.println("\nEnter the imaginary part: ");

		int imgPart2 = sc.nextInt();

		System.out.println("\nThe second complex number is: "+realPart2+"+"+"i"+imgPart2);

		//System.out.println("\nEnter the operation to be performed: 1\Add 2\Subtract 3\Product : ");

		System.out.println("\nThe sum of the complex numbers is: "+sumComplx(realPart1, imgPart1, realPart2, imgPart2));

		System.out.println("\nThe difference of the complex numbers is: "+ diffComplx(realPart1, imgPart1, realPart2, imgPart2));

		System.out.println("\nThe product of the complex numbers is: "+ prodComplx(realPart1, imgPart1, realPart2, imgPart2));

	}

		public static String sumComplx(int realPart1, int imgPart1, int realPart2, int imgPart2)

			{
				int realSum = (realPart1 + realPart2);

				int imgSum = (imgPart1 + imgPart2);

				return realSum+" + "+imgSum+"i";
			}

		public static String diffComplx(int realPart1, int imgPart1, int realPart2, int imgPart2)

			{
				int realDiff = (realPart1 - realPart2);

				int imgDiff = (imgPart1 - imgPart2);

				return realDiff+" + "+imgDiff+"i";
			}

		public static String prodComplx(int realPart1, int imgPart1, int realPart2, int imgPart2)

			{
				int realProduct = (realPart1*realPart2) - (imgPart1*imgPart2);

				int imgProduct = (realPart1*imgPart2) + (imgPart1*realPart2);

				//product = ((realPart1*realPart2) - (imgPart1*imgPart2)) + i((realPart1*imgPart2) + (imgPart1*realPart2));

				return realProduct+" + "+imgProduct+"i";
			}

}
				
		
