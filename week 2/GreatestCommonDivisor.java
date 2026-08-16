import java.util.*;
public class GreatestCommonDivisor {
    public void use() {
    Scanner sc=new Scanner(System.in);
    System.out.print("the first numer : ");
    int num1=sc.nextInt();
    System.out.print("the second numer : ");
    int num2=sc.nextInt();
    sc.close();
    System.out.println(gcd(num1,num2));
}
static int gcd(int n, int m){
    int g;
    n=Math.abs(n);
    m=Math.abs(m);
    do{
    g=n%m;
    n=m;
    m=g;
    } while(m>0);
return n;
}
}