public class SearchInRange {

    // 1. Added startIndex and endIndex to the parameters
    // 2. Renamed to 'searchInRange' to follow Java camelCase naming conventions
    static int searchInRange(int[] arr, int target, int startIndex, int endIndex) {

        // Edge Case 1: Check for null or empty array
        if (arr == null || arr.length == 0) {
            return -1;
        }

        // Edge Case 2: Validate the range to prevent IndexOutOfBoundsException
        // If the user passes a negative start or an end that's too large, we handle it safely.
        if (startIndex < 0 || endIndex >= arr.length || startIndex > endIndex) {
            return -1; // Invalid range, safely return -1
        }

        // Iterate ONLY within the user-defined range
        // Using <= makes the endIndex INCLUSIVE (it checks the endIndex as well)
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == target) {
                return i; // Target found, return its index
            }
        }

        return -1; // Target not found in the specified range
    }

    public static void main(String[] args) {
        int[] nums = {18, 2, -7, 3, 14, 24};

        // Example 1: Search for '3' between index 1 and 4
        // Indices 1 to 4 are: {2, -7, 3, 14}. '3' is at index 3.
        int result1 = searchInRange(nums, 3, 1, 4);
        System.out.println("Result 1 (index of 3): " + result1); // Output: 3

        // Example 2: Search for '18' between index 1 and 4
        // '18' is at index 0, which is OUTSIDE the range 1 to 4.
        int result2 = searchInRange(nums, 18, 1, 4);
        System.out.println("Result 2 (index of 18): " + result2); // Output: -1

        // Example 3: Search the ENTIRE array dynamically
        int result3 = searchInRange(nums, 24, 0, nums.length - 1);
        System.out.println("Result 3 (index of 24): " + result3); // Output: 5
    }
}
