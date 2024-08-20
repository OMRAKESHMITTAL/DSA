public class Lecture2Question2 {
    public static void f(int i,int n){
        if(n<i){
            return;
        }
        System.out.println(i);
        i++;
        f(i,n);
    }
    public static void main(String[] args) {
        f(1,10);
    }
}
