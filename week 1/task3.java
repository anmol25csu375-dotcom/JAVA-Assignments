import java.util.Scanner;

public class task3{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsius * 9.0 / 5.0 + 32.0;

        System.out.println("Fahrenheit = " + fahrenheit);

        sc.close();
    }
}