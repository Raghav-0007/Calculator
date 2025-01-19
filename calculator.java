// import Scanner class
import java.util.Scanner;
import java.time.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nWelcome to calculator");
            System.out.println("Enter '+' for addition");
            System.out.println("Enter '-' for subtraction");
            System.out.println("Enter '*' for multiplication");
System.out.println("Enter '/' for Division");
            System.out.println("Enter 'x' for Exit");
            System.out.println("choose an operation: ");

            char choice = sc.next().charAt(0);
            if (choice == 'x' || choice == 'X') {
                System.out.println("Exiting the calculator");
                break;
            }
            System.out.println("Enter the first number: ");
            double num1 = sc.nextDouble();

            System.out.println("Enter the second number: ");
            double num2 = sc.nextDouble();

            switch (choice) {
                case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;

                case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;

case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;

case '/':
                    System.out.println("Result: " + (num1 / num2));
                    break;


                default:
                    System.out.println("invalid choice");
                    break;
            }
        }

    }
}
