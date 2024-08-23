public class Celing {
    static int b(int[] a,int n) {
        int m=a[1];
        int start=0;
        if(a[1]<a[2]){
            if(a.length == 0) {
                return -1;
            }
            int end=a.length-1;

            while(start<=end) {
                m = (start + end) / 2;
                if (a[m] == n) {
                    return a[m];
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

            int end=a.length-1;

            while(start<=end) {
                 m = (start + end) / 2;
                if (a[m] == n) {
                    return a[m];
                }
                if (a[m] < n) {
                    end = m - 1;

                }else{
                    start = m + 1;
                }
            }
        }
        if(a.length%2==0){
            return a[start];
        }else{
            return a[start];
        }

    }
    public static void main(String[] args) {
        int[] a={1,2,4,5,6,7,8,9};
        System.out.println(b(a,3));
    }
}
