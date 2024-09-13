import java.util.Scanner;
import java.util.ArrayList;

public class MazePath {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int sr=scn.nextInt();
        int sc=scn.nextInt();
        int dr=scn.nextInt();
        int dc=scn.nextInt();
        ArrayList<String> answer=MazePath(sr,sc,dr,dc);
        System.out.println(answer);
    }

    private static ArrayList<String> MazePath(int sr, int sc, int dr, int dc) {
       if(sr==dr && sc==dc){
        ArrayList<String>base=new ArrayList<>();
        base.add("");
        return base;
       }
       
       ArrayList<String>hpaths=new ArrayList<>();
       ArrayList<String>vpaths=new ArrayList<>();

        if(sr<dr){
            vpaths=MazePath(sr+1, sc, dr, dc);
            
        }
        if(sc<dc){
           hpaths=MazePath(sr, sc+1, dr, dc);
       }

       ArrayList<String> ans=new ArrayList<>();
       for(String val:hpaths){
        ans.add("h"+val);
       }

       for(String val:vpaths){
        ans.add("v"+val);
       }

       return ans;
    }
    
    
}
