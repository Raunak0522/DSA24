import java.util.*;
public class DisplayofArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        DisplayofArray(arr,0);
    }

    private static void DisplayofArray(int[] arr, int idx) {
       if(idx == arr.length){
        return;
       }
        System.out.println(arr[idx]);
        DisplayofArray(arr, idx+1);
    }
    
    
}
