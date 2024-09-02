import java.util.*;
public class A_A_B_Again {

    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        int t=scn.nextInt();
        for(int i=0;i<t;i++){
            int n=scn.nextInt();
            int div=n/10;
            int rem=n%10;
            System.out.println(div+rem);
        }
    }
}