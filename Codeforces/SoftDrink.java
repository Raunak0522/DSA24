import java.util.*;
public class SoftDrink {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();
        int l=scn.nextInt();
        int c=scn.nextInt();
        int d=scn.nextInt();
        int p=scn.nextInt();
        int nl=scn.nextInt();
        int np=scn.nextInt();
        System.out.println(n+" "+k+" "+l+" "+c+" "+d+" "+p+" "+nl+" "+np);
        int drink=(k*l)/n;
        int limes=c*d;
        int salt=p/np;
        int min=Math.min(drink,limes);
        int min1=Math.min(min,salt);
        System.out.println(min1/n);



    }
    
}
