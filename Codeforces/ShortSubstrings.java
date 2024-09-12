import java.util.ArrayList;
import java.util.Scanner;

public class ShortSubstrings {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        for(int i=0;i<t;i++){
            String str=scn.next();
            String st="";
            int length=str.length();
            for(int j=0;j<length-1;j++){
                if(j==0){
                    st+=str.charAt(i);
                }
                if(str.charAt(j)==str.charAt(j-1)){
                    st+=str.charAt(j);
                    i++;
                }
            }
            st+=str[length-1];
            System.out.println(st);
        }

    }
}
