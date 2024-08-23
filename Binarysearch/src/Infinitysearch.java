import java.util.ArrayList;

public class Infinitysearch {
    static int b(int[] a,int n) {
        int i = 0;
        while(a[i]<n){
            i=i+10;
        }
            int start=i-10;
            int end=i;
            while(start<=end) {
                int m = (start + end) / 2;
                if (a[m] == n) {
                    return m;
                }
                if (a[m] < n) {
                    start = m + 1;
                }else{
                    end = m - 1;
                }
            }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        System.out.println(b(a,21));

    }
}
