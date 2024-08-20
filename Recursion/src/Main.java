import java.util.*;
public class Main {
    public static int name(int n){
        if(n==0){
            return 1;
        }
        else{
            n--;
            System.out.println("Om");
            return name(n);
        }
    }
    public static void main(String[] args) {
        name(5);
    }
}
