import java.util.*;
public class GradingSystem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks");
        int marks=0;
        marks=sc.nextInt();
        if(marks <= 100 && marks>=80)
        {System.out.println("Distinction");
        }
        else if(marks <80 && marks>=70)
        {System.out.println("Merit");
        } 
        else if(marks <70 && marks>=50)
        {System.out.println("Pass");
        } 
        else if(marks <50)
        {System.out.println("Fail");
        } 
     sc.close();
    }
}
