import java.util.Scanner;
public class A_Spy_Detected {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        for(int i=0;i<t;i++){
            int n=scn.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=scn.nextInt();
            }
            solve(arr);
        }
    }

    private static void solve(int[] arr) {
        if(arr[0]==arr[1]|| arr[0]==arr[2]){
        for(int i=0;i<arr.length;i++){
            if(arr[0]!=arr[i]){
                System.out.println(i+1);
            }
        }
      }
      else{
        System.out.println(1);
      }
    }
}