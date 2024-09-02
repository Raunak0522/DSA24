import java.util.Scanner;

public class PrintBothIncDEc {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        PrintIncreasing(n);
        System.out.println("~~~~~~~~~~~~~~~~~~");
        PrintDecreasing(n);
    }

    private static void PrintIncreasing(int n) {
       if(n==0){
        return;
       }
       PrintIncreasing(n-1);
       System.out.println(n);
    }

    private static void PrintDecreasing(int n) {
        if(n==0){
            return;
           }
           System.out.println(n);
           PrintDecreasing(n-1);
    }
    
}
