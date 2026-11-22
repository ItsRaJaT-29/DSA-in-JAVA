public class PeakIndex {
    static int peakIndexInMountainArray(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while(start < end){ // we are getting end = mid
                int mid = start + (end - start) / 2;

                if(arr[mid] < arr[mid+1]){
                    start = mid + 1;
                }else if(arr[mid] > arr[mid + 1]){
                    end = mid;
                }
            }
            return start;
    }

    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
}
