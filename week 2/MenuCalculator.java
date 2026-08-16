import java.util.*;
public class MenuCalculator {
    public void use() {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int a;
        do {
            printMenu();
            System.out.print("Response : ");
            a = sc.nextInt();
            if (a != 5) {
                System.out.print("First number : ");
                num1 = sc.nextInt();

                System.out.print("Second number : ");
                num2 = sc.nextInt();
            }
            read_operand(a, num1, num2);
            System.out.println();
        } while (a != 5);
        sc.close();
    }

    static void printMenu() {
        System.out.println("WELCOME TO MENU DRIVEN CALCULATOR");
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit");
      
    }
    static void read_operand(int u, int nu, int nm2) {
        switch (u) {
            case 1:
                System.out.println("You chose Addition");
                System.out.println("Addition : " + (nu + nm2));
                break;
            case 2:
                System.out.println("You chose Subtraction");
                System.out.println("Subtraction : " + (nu - nm2));
                break;
            case 3:
                System.out.println("You chose Multiplication");
                System.out.println("Multiplication : " + (nu * nm2));
                break;
            case 4:
                System.out.println("You chose Division");

                if (nm2>0) {
                    System.out.println("Division : " + (nu / nm2));
                } else {
                    System.out.println("Division by zero is not possible.");
                }

                break;

            case 5:
                System.out.println("Exiting the program...........");
                break;

            default:
                System.out.println("Invalid menu choice.");
        }
    }
}