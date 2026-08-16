import java.util.*;
public class NumberReversal{
    public void use() {
    Scanner sc=new Scanner(System.in);
    System.out.print("NUMBER : ");
    int num1=sc.nextInt();
    sc.close();
    System.out.println(num_reversal(num1));
}
static int num_reversal(int n){
    int answer=0;
    while(n!=0){
    answer=answer*10+(n%10);
    n/=10;
    }
    return answer;
}
}