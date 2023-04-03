import java.util.Scanner;

public class RoundNumToDecimalPlaces {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter the number: ");

		double input = sc.nextDouble();

		System.out.printf("\nValue with 3 digits after the decimal point is %.3f %n", input);

	}

}
