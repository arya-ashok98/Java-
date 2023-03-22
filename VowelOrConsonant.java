import java.util.Scanner;

public class VowelOrConsonant {

   public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the alphabet to be checked: ");

      char alphabet = sc.next().charAt(0);

      switch(alphabet) {

   		case 'a': 
			
			System.out.println("\nThe given alphabet "+alphabet+" is is a vowel");
                  	break;

		case 'e':

			System.out.println("\nThe given alphabet "+alphabet+" is is a vowel");
                  	break;

		case 'i':

			System.out.println("\nThe given alphabet "+alphabet+" is is a vowel");
                  	break;

		case 'o':

			System.out.println("\nThe given alphabet "+alphabet+" is is a vowel");
                  	break;

		case 'u':

			System.out.println("\nThe given alphabet "+alphabet+" is is a vowel");
                  	break;

            	default:

			System.out.println("\nThe given alphabet "+alphabet+" is a consonant");

      }

  }

}
