import java.util.Scanner;

public class PrepDecreasing {

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();
        int idx=1;
        PrintDecreasing(n,idx);
    }

    public static void PrintDecreasing(int n,int idx) {
        if(idx>n){
        return ;
       }
        System.out.print(idx+" ");
        PrintDecreasing(n, idx+1);
        // System.out.print(idx+" ");
        System.out.print(idx+" ");
        
    }
}