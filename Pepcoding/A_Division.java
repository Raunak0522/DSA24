import java.util.*;
public class A_Division {

    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        int t=scn.nextInt();
        for(int i=0;i<t;i++){
            int rating=scn.nextInt();
            if(rating<=1399){
                System.out.println("Division 4");
            }
            else if(rating >=1400 && rating<=1599){
                System.out.println("Division 3");
            }
            else if(rating >=1400 && rating<=1899){
                System.out.println("Division 2");
            }
            else{
                System.out.println("Division 1");
            }
        }
    }
}