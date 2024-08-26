import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void sort(int[] a){
        for(int i=0; i<a.length; i++){
            int max = a[0];
            for(int j=0; j<a.length-i-1; j++){
                if(max<a[j]){
                    max = a[j];
                }
            }
            a[a.length-i-1] = max;
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,1,2,5,8,9,4,8,5,2,4};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}