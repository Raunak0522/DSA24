import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        for(int i=0;i<t;i++){
            String str=scn.next();
            String str2=scn.next();
            char a=str.charAt(0);
            char b=str2.charAt(0);
            String mstr=str.substring(1,3);
            String nstr=str2.substring(1,3);
            System.out.println(b+mstr+" "+a+nstr);

        }

    }
    
}
