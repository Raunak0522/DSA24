import java.util.*;
public class Sakura {
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            int ones=scn.nextInt();
            int twos=scn.nextInt();
            int flag=0;
            if(ones%2==0 && twos%2==0){
                System.out.println("YES");
            }
            else if(ones%2==1){
                System.out.println("NO");
            }
            else if(twos%2!=0 && ones>0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            
        }
    }
}
