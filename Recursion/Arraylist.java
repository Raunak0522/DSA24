import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(list+" "+list.size());;
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.set(2, 500);//set the particular value at particular index
        // [10, 20, 500, 40, 50]
        list.add(2,3);//add the particular value at particular index and change the size 
        // [10, 20, 3, 500, 40, 50]

        //print>>
        System.out.println(list+" "+list.size());

        for(int val:list){
            System.out.println(val);
        }

        for(int i=0;i<list.size();i++){
            int val=list.get(i);
            System.out.println(val);
        }
    }
    
}
