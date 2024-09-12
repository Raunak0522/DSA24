import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        for(int i=0;i<t;i++){
            int a=scn.nextInt();
            int b=scn.nextInt();
            int c=scn.nextInt();
            if(a+b==c){
                System.out.println("+");
            }
            else{
                System.out.println("-");
            }
        }

    }
    
}
