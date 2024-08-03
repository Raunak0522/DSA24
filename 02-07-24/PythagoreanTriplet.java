import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int n3=scn.nextInt();

        int max=Math.max(n1, n2);
        int h=Math.max(max, n3);
        // System.out.println(h);
        // System.out.println(n1*n1 +" "+ n2*n2 +" "+ h*h);
        if(n1*n1 + n2*n2 == h*h){
            System.out.println("True");
        }
    }
    
}