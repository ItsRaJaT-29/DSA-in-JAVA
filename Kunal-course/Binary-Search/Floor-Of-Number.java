public class Floor {
    static int floor_number(int[] arr, int target) {
        if (arr.length == 0) return -1;

        int start = 0;
        int end = arr.length - 1;

        // 1. Check order ONCE before the loop starts
        boolean isASC = arr[start] < arr[end];

        // Return -1 if target is smaller than the smallest element
        if (isASC && target < arr[start]) return -1;
        if (!isASC && target < arr[end]) return -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 2. Return immediately if exact target is found
            if (arr[mid] == target) {
                return mid;
            }

            if (isASC) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        // For ascending, 'end' holds the floor. For descending, 'start' holds the floor.
        return isASC ? end : start;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 9, 14, 16, 18};
        int target = 17;
        int ans = floor_number(nums, target);
        System.out.println(ans); // Outputs 4 (index of 14)
    }
}
