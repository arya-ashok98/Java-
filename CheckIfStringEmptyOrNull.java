import java.util.Scanner;

public class CheckIfStringEmptyOrNull {
    
	public static String nullOrEmpty(String input) {

		if(input == null) {

			return "NULL";

		}

		else if(input.isEmpty()) {

			return "EMPTY";

		}
	
		else {

			return "NEITHER EMPTY NOR NULL";

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter the input string: ");

		String input = sc.nextLine();

		System.out.println("\nThe string: "+input+" is: "+nullOrEmpty(input));

      }

}