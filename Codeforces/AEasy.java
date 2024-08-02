import java.util.*;
public class AEasy {

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        int arr[]=new int[t];
        for(int i=0;i<t;i++){
            arr[i]=scn.nextInt();
        }
        int count=0;
        for(int j=0;j<t;j++){
            if(arr[j]==0){
                count++;
            }
        }
        if(count==t){
            System.out.println("Easy");
        }
        else{
            System.out.println("Hard");
        }
    }
}