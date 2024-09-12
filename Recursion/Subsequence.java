import java.util.*;
import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        ArrayList<String> result=Subsequence(str);
        System.out.println(result);
    }

    private static ArrayList<String> Subsequence(String str) {
        if(str.length()==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        char ch=str.charAt(0);
        String sub=str.substring(1);
        ArrayList<String> neww=Subsequence(sub);
        ArrayList<String> ans=new ArrayList<>();
        for(String val:neww){
            ans.add(""+val);
        }
        for(String val:neww){
            ans.add(ch+val);
        }
        return ans;
    }
    
}
