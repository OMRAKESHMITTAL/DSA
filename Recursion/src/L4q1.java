import java.util.ArrayList;
import java.util.Scanner;

public class L4q1 {
    public static void F(ArrayList<Integer> a){
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
    }
    public static void f(ArrayList<Integer> a,int i){
        if(i>=(a.size()/2)){
            return;
        }
        int temp=a.get(i);
        a.set(i,a.get(a.size()-1-i));
        a.set(a.size()-1-i,temp);
        f(a,i+1);

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(1);
        list.add(10);
        list.add(9);
        F(list);
        f(list,0);
        F(list);

    }

}
