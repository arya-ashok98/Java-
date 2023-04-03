import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.Scanner;

public class ParseStringToDate {

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter the String input: ");

		String input = sc.nextLine(); // 03/04/2023

		Date parseInput = new SimpleDateFormat("dd/MM/yyyy").parse(input);

		System.out.println("The parsed input for "+input+" is: "+parseInput);

	}

}