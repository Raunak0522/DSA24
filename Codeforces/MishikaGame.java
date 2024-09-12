import java.util.Scanner;

public class MishikaGame {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        int mis=0;
        int chris=0;
        for(int i=0;i<t;i++){
            int a=scn.nextInt();
            int b=scn.nextInt();
            if(a>b){
                mis++;
            }
            else if (a<b){
                chris++;
            }
           
        }
        if(mis>chris){
            System.out.println("Mishka");
        }
        else if(mis<chris){
            System.out.println("Chris");
        }
        else{
            System.out.println("Friendship is magic!^^");
        }
    }
}
