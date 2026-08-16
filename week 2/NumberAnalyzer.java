import java.util.Scanner;

public class NumberAnalyzer {
    static int readNumber(Scanner s) {
        return s.nextInt();
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static boolean isPositive(int n) {
        return n > 0;
    }

    static int absoluteValue(int n) {
        return n < 0 ? -n : n;
    }

    static int countDigits(int n) {
        if (n == 0) {
            return 1;
        }

        int c = 0;
        while (n > 0) {
            n /= 10;
            c++;
        }
        return c;
    }

    static int sumDigits(int n) {
        int s = 0;
        do {
            s += n % 10;
            n /= 10;
        } while (n > 0);
        return s;
    }

    static void printReport(int n, boolean e, boolean p, int c, int s){
        System.out.println("Number Analysis Report");
        System.out.println("Number: " + n);
        System.out.println("Even: " + e);
        System.out.println("Positive: " + p);
        System.out.println("Digit count: " + c);
        System.out.println("Digit sum: " + s);
    }
}