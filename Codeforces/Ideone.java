import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes herezzz
		Scanner sc=new Scanner(System.in);
		long a[]=new long[4];
		for(int i=0;i<4;i++)
		{
			a[i]=sc.nextLong();
		}
		Arrays.sort(a);
		long c=0;
		for(int i=0;i<3;i++)
		{
			if(a[i]==a[i+1])
			{
				c++;
			}
		}
		System.out.println(c);
	}
}

// import java.util.Arrays;
// import java.util.Scanner;

// public class AIsit{
//     public static void main(String[] args) {
//         Scanner scn=new Scanner(System.in);
//         long a[]=new long[4];
// 		for(int i=0;i<4;i++)
// 		{
// 			a[i]=scn.nextLong();
// 		}
// 		Arrays.sort(a);
// 		long c=0;
// 		for(int i=0;i<3;i++)
// 		{
// 			if(a[i]==a[i+1])
// 			{
// 				c++;
// 			}
// 		}
// 		System.out.println(c);
//         // long[] arr=new long[4];
//         // for(int i=0;i<4;i++){
//         //     arr[i]=scn.nextLong();
//         // }
//         // int count=0;
//         // for(int i=0;i<3;i++){
//         //     if(arr[i]==arr[i+1]){
//         //         count++;
//         //     }
//         // }
//         // System.out.println(count);
//     }
// }