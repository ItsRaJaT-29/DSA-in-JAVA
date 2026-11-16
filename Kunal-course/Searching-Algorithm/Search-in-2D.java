import java.util.Arrays;

public class SearchIn2D_Array {

    static int[] search(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
       return new int[]{-1, -1};

    }

    public static void main(String[] args) {
        int [][] arr = {
                {34,12,5},
                {4,55,6},
                {77,45,99,109},
                {12,76,9,69}
        };
        int target = 9;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}
