public class Ceiling {
    static int ceiling_number(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // 1. Check order ONCE before the loop starts
        boolean isASC = arr[start] < arr[end];

        // Optional: return -1 if target is greater than the largest element
        if (isASC && target > arr[end]) return -1;
        if (!isASC && target > arr[start]) return -1;

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

        // Note: For descending arrays, 'end' holds the ceiling index, not 'start'
        return isASC ? start : end;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling_number(nums, target);
        System.out.println(ans); // Outputs 5 (index of 16)
    }
}
