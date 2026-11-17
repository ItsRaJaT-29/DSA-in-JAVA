public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,9,12,45,67,98,99,122};
        int target = 67;
        int ans = binarySearch(nums,target);
        System.out.println(ans); // 6

    }

    //return index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            //find the middle
       //     int mid = (start + end ) / 2; // this may exceed if value is too large so we will take more optimised option
            int mid = start + (end - start) / 2 ;

            if (target < arr[mid]) {
                // Target is smaller, search the left half
                end = mid - 1;
            } else if (target > arr[mid]) {
                // Target is larger, search the right half
                start = mid + 1;
            } else {
                // Target found
                return mid;
            }
        }
        return -1;

    }
}
