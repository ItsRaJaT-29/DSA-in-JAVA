public class PeakIndex {
    static int peakIndexInMountainArray(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while(start < end){ // we are getting end = mid
                int mid = start + (end - start) / 2;

                if(arr[mid] < arr[mid+1]){
                    // You are in Ascending part
                    start = mid + 1; // because we know that mid+1 element > mid element
                }else if(arr[mid] > arr[mid + 1]){
                    //you are descending part of the array
                    //this may be the ans but look at left
                    //this is why end != mid - 1
                    end = mid;
                }
            }
            // in the end , start ==  end nd pointing to the largest because of the 2 checks above
            // start and end are always trying to find the max element in the above 2 checks
            // hence , when they are pointing to just one element, that's the max one because that is what checks say
            return start;
    }

    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
}
