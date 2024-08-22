//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int linear(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(linear(arr,7));
    }
}
