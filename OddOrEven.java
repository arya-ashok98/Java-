import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the number to be checked: ");

       int number = sc.nextInt();

       if(number % 2 == 0) { 

           System.out.println("The number is even");

       }

       else

           System.out.println("The number is odd");

    }

}