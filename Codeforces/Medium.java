import java.util.Arrays;
import java.util.Scanner;

public class Medium {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        for(int i=0;i<t;i++){
            int [] arr=new int[3];
            for(int ii=0;ii<3;ii++){
                arr[ii]=scn.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
    }
}
