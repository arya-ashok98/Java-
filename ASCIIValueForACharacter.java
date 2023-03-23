import java.util.Scanner;

public class ASCIIValueForACharacter {

    public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    System.out.println("\nEnter the character to be checked for its ASCII value: ");

    char character = sc.next().charAt(0);

    int ascii = character; // can directly convert a character to ASCII value directly by assigning to a int variable

    // int castAscii = (int) character; // or can convert by typecasting method

    System.out.println("\nThe ASCII value for the inputed character "+character+" is: "+ascii);

    }

}