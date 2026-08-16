import java.util.*;
public class LoopPatterns {
    public void use(){
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        if(a>1){
            System.out.println("PRINTING PATTERN A");
            for(int i=0;i<=a;i++){
                for(int k=0;k<=a;k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println(" PRINTING PATTERN B");
              for(int i=0;i<=a;i++){
                for(int k=0;k<=i;k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
              System.out.println("PRINTING PATTERN C ");
              for(int i=1;i<=a;i++){
                for(int k=1;k<=i;k++){
                    System.out.print(k+" ");
                }
                System.out.println();
            }
             System.out.println("PRINTING PATTERN D");
              for(int i=0;i<=a;i++){
                for(int k=a;k>=i;k--){
                    System.out.print("* ");
                }
                System.out.println();
            }
             System.out.println("PRINTING PATTERN E");
              for(int i=1;i<=a;i++){
                for(int k=1;k<=i;k++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
        else System.out.println("invalid pattern size");

    }
}