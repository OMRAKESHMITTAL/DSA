public class L2q5 {
    public static void f(int i,int n) {
        if(i>n) {
            return;
        }
        f(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        f(1,10);
    }
}
