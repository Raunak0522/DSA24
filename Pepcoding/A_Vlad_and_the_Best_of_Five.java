import java.util.*;

public class A_Vlad_and_the_Best_of_Five {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        for(int i=0;i<t;i++){
            String str=scn.next();
            char a='A';
            int aa=0;
            int bb=0;
            char b='B';
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==a){
                    aa++;
                }
                else{
                    bb++;
                }
            }
            if(aa>bb){
                System.out.println("A");
                aa=0;
            }
            else{
                System.out.println("B");
                bb=0;
            }
        }

    }
}