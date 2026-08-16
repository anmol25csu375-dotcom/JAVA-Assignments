import java.util.*;
public class LeapYear {
    public void use(){
        Scanner sc=new Scanner(System.in);
        System.out.println("the response of the number is : ");
        int a= sc.nextInt();
        System.out.println(isLeapYear(a));
    }
    static boolean isLeapYear(int year){
        // for a leap year 
        if(year%400==0 && (year%4==0 || year%100!=0)) return true;
        return false;
    }
}