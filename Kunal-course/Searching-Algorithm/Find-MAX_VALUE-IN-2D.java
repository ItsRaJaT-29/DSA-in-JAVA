import java.util.Arrays;

public class MAX_IN_2D_Array {

    static int Find_MAX(int[][] arr){
        int max = Integer.MIN_VALUE;
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                    }
                }
            }
        return max;
    }
    public static void main(String[] args) {
        int [][] arr = {
                {34,12,5},
                {4,55,6},
                {77,45,99,109},
                {12,76,9,69}
        };
        int ans = Find_MAX(arr);
        System.out.println(ans);
    }
}
