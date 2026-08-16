import java.util.*;
public class PrimeNumber {
    public void use(){
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println(isPrime(a));

    }
    static boolean isPrime(int number){
        if(number>=2){
            for(int i=2;i<number;i++){
                if(number%i==0){
                    return false;
                }
            }
            return true;
        }
        return false;
}
}