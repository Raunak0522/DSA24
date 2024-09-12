import java.util.Scanner;

public class BDrinks {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        float n=scn.nextInt();
        float sum=0;
        for(int i=0;i<n;i++){
            float vol=scn.nextInt();
            sum=sum+vol;
            // System.out.println(sum);
        }
        float ans=sum/n;
        System.out.println(ans);
    }
}
