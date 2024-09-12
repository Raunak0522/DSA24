import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNo{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int[] arr=new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[3]-arr[0]+" ");
        System.out.print(arr[3]-arr[1]+" ");
        System.out.print(arr[3]-arr[2]+" ");
    }
}