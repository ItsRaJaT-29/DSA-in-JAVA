public class InfiniteArray {
    public static void main(String[] args) {
        // Simulating an infinite sorted array
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;

        System.out.println(findPOS(arr, target)); // Output: 4
    }

    static int findPOS(int[] arr, int target){
        // 1. Start with a box of size 2
        int start = 0;
        int end = 1;


        // 2. Double the box size until target is within the range
        while(target > arr[end]) {
            int newStart = end + 1;
            // New end = previous end + (size of current box * 2)
            end = end + (end - start + 1) * 2 ;
            start = newStart;
        }
        return BinarySearch(arr,target,start,end);
    }

    static int BinarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

             if(target > arr[mid]){
                start = mid + 1;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
             }
        }
        return -1;
    }

}
