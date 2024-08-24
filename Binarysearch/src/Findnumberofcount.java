public class Findnumberofcount {
    public static int peakIndexInMountainArray(int[] a) {
        int start = 0;
        int end = a.length - 1;
        int m = (start + end) / 2;
        while (start < end) {
            m = (start + end) / 2;
            if(a[m]>=a[start]){
                if (a[m] < a[m + 1]) {
                    start = m + 1;
                } else {
                    end = m;
                }
            }else{
                end = m;
            }
        }
        return start+1;
    }
    public static void main(String[] args) {
        int[] a = {6,7,8,9,1,2,3,4,5};
        System.out.println(peakIndexInMountainArray(a));
    }
}
