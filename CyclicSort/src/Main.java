import java.util.Arrays;

public class Main {
    public static void swap(int[] a ,int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void sort(int[] a) {
        int i = 0;
        while (i < a.length - 1) {
            if (a[i] != i + 1) {
                swap(a,i,a[i]-1);
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {2,4,1,5,3,6};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}