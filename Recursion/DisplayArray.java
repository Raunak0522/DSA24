//Display all the elements of an array;
//expectation Display(arr,idx);>>> prints all the element of an array
//faith Display all the elements from idx+1
//result print arr[idx]then rest faith will print;

import java.util.Scanner;

public class DisplayArray {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        DisplayArray(arr,0);
    }

    public static void DisplayArray(int[] arr,int idx){
        if(idx==arr.length){
            return;
        }
        System.out.print(arr[idx]+" ");
        DisplayArray(arr, idx+1);

    }
}