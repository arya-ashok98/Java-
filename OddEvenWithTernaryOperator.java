import java.util.Scanner;

public class OddEvenWithTernaryOperator {

    public static void main(String args[]) {

       int number;
    
       String result;

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the number to be checked for even: ");

       number = sc.nextInt();

       result = (number % 2 == 0) ? ("The Number is even") : ("The Number is odd");

       System.out.println(result);

    }

}