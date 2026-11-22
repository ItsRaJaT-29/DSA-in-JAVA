public class SearchInMountain {

    static int findInMountainArray(int target, int[] arr) {
        int peak = MountainPeak(arr);
        int F_try = OrderAgnostic_BinarySearch(arr, target, 0, peak);
        if (F_try != -1) {
            return F_try;
        }
        // Try to search in second half
        return OrderAgnostic_BinarySearch(arr, target, peak + 1, arr.length - 1);
    }

    static int MountainPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                // Increasing side
                start = mid + 1;
            } else {
                // Decreasing side
                end = mid;
            }
        }
        return start;
    }

    static int OrderAgnostic_BinarySearch(int[] arr, int target, int start, int end) {
        boolean isASC = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isASC) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
