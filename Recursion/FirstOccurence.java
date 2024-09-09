// expec first occurence 0 to n
// faith first occurence 1 to n
// result>>expec+faith;

import java.util.Scanner;

public class FirstOccurence {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        int occur=FirstOccurence(arr,0,k);
        System.out.println(occur);

    }

    private static int FirstOccurence(int[] arr, int idx,int k) {
       if(idx==arr.length){
        return-1;
       }
        int fo= FirstOccurence(arr,idx+1,k);
        if(arr[idx]==k){
            return idx;
        }
        else{
            return fo;
        }
    }    
}
