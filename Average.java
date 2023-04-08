import java.util.Scanner;

public class Average {

		public void calculateAverage(double FirstNum, double SecondNum, double ThirdNum) {

			double average = (FirstNum + SecondNum + ThirdNum)/3;

			System.out.println("\nThe average of the inputed numbers is: "+average);

		}

		public static void main(String args[]) {

			double FirstNum, SecondNum, ThirdNum;

			Scanner sc = new Scanner(System.in);

			System.out.println("\nEnter the first number: ");

			FirstNum = sc.nextDouble();

			System.out.println("\nEnter the second number: ");

			SecondNum = sc.nextDouble();

			System.out.println("\nEnter the third number: ");

			ThirdNum = sc.nextDouble();

			Average average = new Average();

			average.calculateAverage(FirstNum, SecondNum, ThirdNum);


		}

}

			