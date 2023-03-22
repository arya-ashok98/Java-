import java.util.Scanner;

public class Calculator {

   public static void main(String args[]) {

       int result, choice;
        
       Scanner sc = new Scanner(System.in);

       while(true) {  

         System.out.println("\nEnter the first operand: ");

         int a = sc.nextInt();

         System.out.println("\nEnter the second operand: ");

         int b = sc.nextInt();

         System.out.println("\n 1: Addition\n 2: Subtraction\n 3: Multiplication\n 4: Division\n 5: Modulus\n 6: Exit\n");

         System.out.println("Choose any of the above options: ");

         choice = sc.nextInt();

         switch(choice) {
 

            case 1: result = a+b;

			  System.out.println("The addition of the numbers " +a+" and "+b+" is: " +result);

               	  break;

       	case 2: result = a-b;

			  System.out.println("The subtraction of the numbers " +a+" and "+b+" is: " +result);

               	  break;

       	case 3: result = a*b;

			  System.out.println("The multiplication of the numbers " +a+" and "+b+" is: " +result);

               	  break;

       	case 4: result = a/b;

			  System.out.println("The division of the numbers " +a+" and "+b+" is: " +result);

               	  break;

       	case 5: result = a%b;

			  System.out.println("The modulus of the numbers " +a+" and "+b+" is: " +result);

               	  break;

            case 6: System.exit(0);

       	Default: System.out.println("Invalid choice");

          }

      }

  }

}