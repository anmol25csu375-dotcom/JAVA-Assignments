import java.util.Scanner;
public class ArrayStatistics {
   
    static int sum(int[] values)
    {
        int sum=0;
        for(int i=0;i<=values.length;i++)
        {
            sum+=values[i];
        }
        
        return sum;
    }
    static double average(int[] values)
    {
        double avg=0.0;
        avg=sum(values)/values.length;
        return avg;
    }
    static int minimum(int[] values)
    {
        int min=values[0];
        for(int i=1;i<values.length;i++)
        {
            if(min >= values[i])
                min=values[i];
        }
        return min;
    }
    static int maximum(int[] values)
    {
        int max=values[0];
        for(int i=1;i<values.length;i++)
        {
            if(max <= values[i])
                max=values[i];
        }
        return max;
    }
    static int countEven(int[] values)
    {
        int e=0;
         for(int i=1;i<values.length;i++)
        {
           if(values[i] %2 == 0)
            e++;
         }
         return e;
    }
      static int countOdd(int[] values)
    {
        int o=0;
         for(int i=1;i<values.length;i++)
        {
           if(values[i] %2 != 0)
            o++;
        }
        return o;
    }
    static void printSignCounts(int[] values)
    {
      int pos=0,neg=0,ze=0;
       for(int i=1;i<values.length;i++)
        {
            if(values[i]==0)
            ze++;
            else if (values[i]>0)
            pos++;
            else
            neg++;    
        }
        System.out.println("No. of positive numbers are "+ pos);
        System.out.println("No. of negative numbers are "+ neg); 
        System.out.println("No. of zeros are "+ ze); 
    }
    public static void main(){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter size of array");
    int n=sc.nextInt();
    int []values=new int [n];

    System.out.println("Enter the values of array");
    for (int i=0;i<n;i++)
        values[i]=sc.nextInt();
    
    int s=sum(values);
    System.out.println("Sum of array is "+ s);
    
    double a=average(values);
    System.out.println("Average of array is "+ a);
     
    int mi=minimum(values);
    int ma=maximum(values);
    System.out.println("Minimum Number in the array is "+ mi);
    System.out.println("Maximum Number in the array is "+ ma);

    int even=countEven(values);
    int odd=countOdd(values);
    System.out.println("No. of even elements are " + even);
    System.out.println("No. of odd elements are " + odd);
     
    printSignCounts(values);
}
}