public class FindMin {
   static int Find_min(int[] arr){
       if(arr.length == 0 ){
           return -1;
       }
       int min = Integer.MAX_VALUE;  //Set the min to a MAX POSSIBLE VALUE
       for(int i = 0; i < arr.length;i++){
           if(arr[i] < min){
               min = arr[i];
           }
       }
       return min;
   }

    public static void main(String[] args) {
        int[] nums = {12,4,76,-9,1};
       int result = Find_min(nums);
        System.out.println("Min Array is : "+result);
    }
}
