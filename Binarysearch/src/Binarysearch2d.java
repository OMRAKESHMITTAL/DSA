import java.util.Arrays;

public class Binarysearch2d {
    public static int[] search(int[][]a,int n){
        int s1 = 0;
        int e1 = a.length-1;
        int m1 = 0;
        while(s1<=e1){
            m1 = (s1+e1)/2;
            if(a[m1][e1]<n){
                s1 = m1+1;
            }else{
                e1 = m1-1;
            }
        }
        int s2 = 0;
        int e2 = a[m1].length-1;
        while(s2<=e2){
            int m2   = (s2+e2)/2;
            if(a[m1][m2]==n){
                return new int[]{m1,m2};
            }
            if(a[m1][m2]<n){
                s2 = m2+1;
            }else{
                e2 = m2-1;
            }

        }
        return new int[] {-1,-1};

    }
    public static void main(String[] args) {
        int [][] a ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(Arrays.toString(search(a,19)));
    }
}
