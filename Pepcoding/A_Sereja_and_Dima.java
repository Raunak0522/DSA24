import java.util.*;
public class A_Sereja_and_Dima {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        boolean turn=true;
        int i=0;
        int j=arr.length - 1;
        int a = 0 ;
        int b = 0 ;
        while(i<=j){
            if(turn){
                a+=Math.max(arr[i],arr[j]);
                if(Math.max(arr[i],arr[j])== arr[i]){
                    i++;
                }
                else{
                    j--;
                }
                turn =!turn;
            }
            else{
                b+=Math.max(arr[i],arr[j]);
                if(Math.max(arr[i],arr[j])== arr[i]){
                    i++;
                }
                else{
                    j--;
                }
                turn =!turn;
            }
        }
        System.out.println(a + " " + b);
    }
}