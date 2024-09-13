import java.util.*;
public class Keypadcombination {

    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        String str=scn.next();
        //678

        ArrayList<String> words=Combination(str);
        System.out.println(words);
    }

    static String[] codes={":;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz",};

    private static ArrayList<String> Combination(String str) {
        if(str.length()==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;

        }
        //678
        char ch=str.charAt(0);//6---pqrs
        String rem=str.substring(1);//78
        ArrayList<String> ans=Combination(rem);//7-combination and 8-combination
        ArrayList<String> result=new ArrayList<>();//new arraylist

        String WordsFromcodes=codes[ch-'0'];//"6"  && 6 is different so minus with 0
        for(int i=0;i<WordsFromcodes.length();i++){
            char chfromCode=WordsFromcodes.charAt(i);//p q r s 
            for(String val:ans){
                result.add(chfromCode+val);//for every value of code it prints 
            }
        }

        return result;
        //6-pqrs
        //7-tuv
        //8-wxx
        //result has 4*(3+3);24 words
        
    }
}