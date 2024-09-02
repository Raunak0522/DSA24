import java.util.Scanner;

public class PowerLog {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int pow=scn.nextInt();
        int ans=Power(n,pow);
        System.out.println(ans);

    }

    private static int Power(int n, int pow) {
       if(pow==0){
        return 1;
       }
       int result=Power(n,pow/2);
       int ans=result*result;
      
       if(pow%2==1){
        ans=n*result*result;
       }
       return ans;
    }
}