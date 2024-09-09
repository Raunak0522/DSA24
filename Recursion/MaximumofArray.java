import java.util.Scanner;

public class MaximumofArray {
    public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

       int max1= MaximumofArray(arr,0);
       System.out.println(max1);
    }

    private static int MaximumofArray(int[] arr, int idx) {
       if(idx==arr.length-1){
        return arr[idx];
       }
       
        int max=MaximumofArray(arr, idx+1);
       if(max>arr[idx]){
        return max;
       }
       else{
        return arr[idx];
       }
    }
}
