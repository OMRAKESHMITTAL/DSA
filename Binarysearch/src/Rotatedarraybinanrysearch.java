public class Rotatedarraybinanrysearch {
        public static int search(int[] a, int target) {
            int end = peakIndexInMountainArray(a);
            int ans = b(a,target,end);
            return ans;
        }
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
            return start;
        }
        public static int b(int[] a,int n,int end) {
            int e =end;
            int start=0;
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
            start=e+1;
            end = a.length-1;
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
            int[] a = {2,8,9,2,2};
        System.out.println(search(a,9));

    }
    }

