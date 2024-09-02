import java.util.*;
public class A_Dora_s_Set {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        int count=0;
        for(int i=0;i<t;i++){
            int a= scn.nextInt();
            int c= scn.nextInt();
            System.out.println(gcd(a, c));
            // for(int j=a+1 ;j<c;j++){
            //     if(gcd(a,j)==1 && gcd(j,c)==1 && gcd(a,c)==1){
            //         System.out.print(a+" ");
            //         System.out.print(c+" ");
            //         System.out.print(j+" ");
            //         count++;
            //     }
            // }
        }
        // System.out.println(count);
    }

    private static int gcd(int a, int b) {
        // while(a % b !=0){
        //     int rem=a%b;
        //     a=b;
        //     b=rem;
        // }
        while(a!=b)   
        {  
        if(a>b)  
        a=a-b;  
        else  
        b=b-a;  
        }  
        System.out.printf("GCD of n1 and n2 is: " +b);
        return b;
    }
}