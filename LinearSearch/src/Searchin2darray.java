public class Searchin2darray {
    static int[] searchin2d(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    int[] n={i, j};
                    return n;
                }
            }
        }
        int[] n = {-1, -1};
        return n;
    }
    public static void main(String[] args) {
        int[][] a={{1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}};
        int[] b = searchin2d(a,9);
        System.out.println(b[0]);
        System.out.println(b[1]);

    }
    }

