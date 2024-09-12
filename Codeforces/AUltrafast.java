import java.util.*;
public class AUltrafast {
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        String str=scn.next();
        String str1=scn.next();
        int[] arr=new int[str.length()];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==str1.charAt(i)){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        for(int i=0;i<str.length();i++){
            System.out.print(arr[i]);
        }
    }
}
