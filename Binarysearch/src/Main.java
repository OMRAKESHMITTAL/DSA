public class Main {
    static int b(int[] a,int n) {
        if(a[1]<a[2]){
        if(a.length == 0) {
            return -1;
        }
        int start=0;
        int end=a.length-1;
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
        }else{
            if(a.length == 0) {
                return -1;
            }
            int start=0;
            int end=a.length-1;
            while(start<=end) {
                int m = (start + end) / 2;
                if (a[m] == n) {
                    return m;
                }
                if (a[m] < n) {
                    end = m - 1;

                }else{
                    start = m + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        int[] b={9,8,7,6,5,4,3,2,1};
        System.out.println(b(a,8));
        System.out.println(b(b,2));
    }
}