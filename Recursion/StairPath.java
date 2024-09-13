import java.util.ArrayList;
import java.util.Scanner;

public class StairPath {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<String> result=StairPath(n);
        System.out.println(result);
    }

    private static ArrayList<String> StairPath(int n) {
       if(n==0){
        ArrayList<String> base=new ArrayList<>();
        base.add("");
        return base;
       }
       else if(n<0){
        ArrayList<String> base=new ArrayList<>();
        return base;
        
       }

        ArrayList<String> path1=StairPath(n-1);
        ArrayList<String> path2=StairPath(n-2);
        ArrayList<String> path3=StairPath(n-3);

        ArrayList<String> ans=new ArrayList<>();
        for(String val:path1){
            ans.add(1+val);
        }
        for(String val:path2){
            ans.add(2+val);
        }
        for(String val:path3){
            ans.add(3+val);
        }

        return ans;
    }

    
}