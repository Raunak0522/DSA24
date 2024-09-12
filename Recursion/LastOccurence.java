import java.util.Scanner;

public class LastOccurence {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

       int idx= LastOccurenc(arr,0,k);
       System.out.println(idx);

    }

    public static int LastOccurenc(int[] arr,int idx,int k){
        if(idx==arr.length){
            return-1;
        }
        
        int lastIdx=LastOccurenc(arr,idx+1,k);
        if(lastIdx == -1){
            if(arr[idx]==k){
                return idx;
            }
            else{
                return -1;
            }
        }
        else{
            return lastIdx;
        }
    }
}
