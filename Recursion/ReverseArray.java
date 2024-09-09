//expectation Reverse will print all the element from reverse
//faith reverse will print all the reserve elements till one idex
//ep+fat will print the idx

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        ReverseArray(arr,0);
        
    }

    private static void ReverseArray(int[] arr, int idx) {
       if (idx==arr.length){
        return;
       }
        ReverseArray(arr, idx+1);
       System.out.print(arr[idx]);

    }
    
}
