public class minelement {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,-2,6,7,8,9,10};
        System.out.println(min(a));
    }
    static int min(int[] a){
        int min = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }
}
