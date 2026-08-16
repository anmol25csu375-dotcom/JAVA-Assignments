import java.util.*;
public class marks{
    public void use() {
        int a;
        int sum = 0, total_no = 0, hig = 0, pa = 0, fa = 0;
        double average = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter the marks here : ");
            a = sc.nextInt();
            if (a >= 0) {
                if (isValidMarks(a)) {
                    total_no++;
                    sum += a;
                    if (a > hig) {
                       hig = a;
                    }
                    if (a >= 50) {
                        pa++;
                    } else {
                        fa++;
                    }
                }
            }

        } while (a != -1);
        if (total_no > 0) {
          average = (double) sum / total_no;
        }
        sc.close();
        System.out.println("\nNumber of valid marks: " + total_no);
        System.out.println("Sum of marks: " + sum);
        System.out.println("Average mark: " + average);
        System.out.println("Highest mark: " + hig);
        System.out.println("Number of passes: " + pa);
        System.out.println("Number of failures: " + fa);
    }
    static boolean isValidMarks(int ano) {
        if (ano >= 0)
            return true;
        else
            return false;
    }
}