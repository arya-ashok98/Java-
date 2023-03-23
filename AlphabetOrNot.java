import java.util.Scanner;

public class AlphabetOrNot {

    public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       System.out.println("\nEnter the character to be checked for alphabet: ");

       char input = sc.next().charAt(0);

       if((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) {

            System.out.println("\nThe inputed character "+input+" is an alphabet");

       }

       else {

            System.out.println("\nThe inputed character "+input+" is not an alphabet");

       }
    
    }

}        