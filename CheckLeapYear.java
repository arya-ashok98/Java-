import java.util.Scanner;

public class CheckLeapYear {

    public static void main(String args[]) {

         int year;

         Scanner input = new Scanner(System.in);

         System.out.println("\nEnter the year to be checked for leap year: ");

         year = input.nextInt();

         if(year % 4 == 0) {

             System.out.println("\nThe entered number, "+year+" is a leap year");

         }

         else {

             System.out.println("\nThe entered number, "+year+" is not a leap year");

         }

     }

}