import java.util.Arrays;

public class Array2d {
    public static int[] search(int[][] a,int target){
        int s1=0;
        int e1=a.length-1;
        while (s1 <= e1 && e1>=0 ) {
            if(a[s1][e1]==target){
                return new int[]{s1,e1};
            }else if(a[s1][e1]<target){
                s1++;
            }else {
                e1++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(search(a,36)));
    }
}
