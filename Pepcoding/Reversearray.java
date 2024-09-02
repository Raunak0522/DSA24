import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reversearray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int idx=0;
        List<Integer> arr1=reverse(arr,idx , arr.length - 1);
        for(int val: arr1){
            System.out.println(val);
        }

    }

    private static List<Integer> reverse(int[] arr, int idx , int n) {
        if(idx > n){
            return new ArrayList<>();
        }

        List<Integer> x = reverse(arr, idx + 1, n);
        x.add(arr[idx]);
        return x;

    }    
}
