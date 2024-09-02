import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int pow=scn.nextInt();
        int ans=PowerLinear(n,pow);
        System.out.println(ans);
    }

    private static int PowerLinear(int n,int pow) {
        if(pow==0){
            return 1;
        }
        int power=PowerLinear(n, pow-1);
        int ans=n*power;
       return ans;
    }
    
}
