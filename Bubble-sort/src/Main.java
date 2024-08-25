import java.util.Arrays;

public class Main {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sort(int[] a){
        int counter = 0;
        for(int j = 1; j<a.length; j++) {
            counter = 0;
        for (int i = 0; i < a.length-j; i++) {
            if (a[i] > a[i + 1]) {
                swap(a, i, i + 1);
                counter = 1;
            }
        }
            if(counter == 0 ){
                break;
            }
    }
    }
    public static void main(String[] args) {
        int [] a = {1, 1, 1, 2, 2, 2, 3, 4, 4, 4, 5, 7, 7, 8, 8, 8, 8, 9, 9, 10, 25, 98, 100, 101};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}