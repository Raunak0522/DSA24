import java.util.Scanner;

public class Lucky {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        for(int i=0;i<t;i++){
            String str= scn.next();
            int sum1=0;
            int sum2=0;
            for(int j=0;j<3;j++){
                sum1+=str.charAt(j);
            }
            for(int k=3;k<str.length();k++){
                sum2+=str.charAt(k);
            }

            if(sum1==sum2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}