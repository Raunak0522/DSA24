import java.util.*;
public class A_Fair_Playoff {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        for(int i=0;i<t;i++){
            int[] arr=new int[4];
            for(int ii=0;ii<arr.length;ii++){
                arr[ii]=scn.nextInt();
            }
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
            solve(arr);
            
        }

    }

    private static void solve(int[] arr) {
       int i=0;
       int j=1;
       int p1=0;
       int p2=0;
       while(i<arr.length|| j<arr.length-1){
            if(arr[i]< arr[j]){
                p1++;
            }
       }
       System.out.println(p1);
    }
}