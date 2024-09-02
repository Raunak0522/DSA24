import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int fact=PrintFactorial(n);
        System.out.println(fact);
    }

    private static int PrintFactorial(int n) {
       if(n==1){
        return 1;
       }
        int fn=PrintFactorial(n-1);
        int fact=n*fn;
        return fact;
       //n!=n*n-1*n-2;

    }
    
}
