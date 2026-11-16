public class FindMax {
    static int Find_max(int[] arr){
        if(arr.length == 0 ){
            return -1;
        }
        int max = Integer.MIN_VALUE;  //Set the min to a MIN POSSIBLE VALUE
        for(int i = 0; i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-12,-4,-76,-9,-1};
        int result = Find_max(nums);
        System.out.println("Max Array is : "+ result);
    }
}

