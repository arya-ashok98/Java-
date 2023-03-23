import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String args[]) {

       int range, i, sum = 0;

       Scanner sc = new Scanner(System.in);

       System.out.println("\nEnter the number range you wish to sum: ");

       range = sc.nextInt();

       for (i = 1; i <= range; i++) {

           sum = sum + i;

       }

       System.out.println("\nThe sum of natural numbers in the range from 1 to "+range+" is: "+sum);

    }

}