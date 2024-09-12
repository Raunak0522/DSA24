import java.util.Scanner;

public class Hulk {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        String hate="I hate it";
        String love="I love";
        if(n==1){
            System.out.println(hate+"it");
        }
        for(int i=0;i<n;i++){
            if(n%2==0){
                System.out.print(hate+" "+"that"+" ");
            }
            else{
                System.out.print(odd+"that");
            }
        }
    }
}
