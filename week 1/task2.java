
   import java.util.Scanner;
public class task2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Sum = " + (num1 + num2));
        System.out.println("Difference = " + (num1 - num2));
        System.out.println("Product = " + (num1 * num2));
        System.out.println("Quotient = " + (num1 / num2));

        int a = (int) num1;
        int b = (int) num2;

        System.out.println("Remainder = " + (a % b));

        sc.close();
    }
} 

