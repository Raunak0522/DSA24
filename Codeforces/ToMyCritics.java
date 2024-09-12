import java.util.Scanner;

public class ToMyCritics {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        for(int i=0;i<t;i++){
            int a=scn.nextInt();
            int b=scn.nextInt();
            int c=scn.nextInt();
            if((a+b>=10)||(b+c>=10)||(a+c>=10)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}
