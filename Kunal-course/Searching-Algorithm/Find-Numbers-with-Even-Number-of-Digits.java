public class Even_Digits {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums)); // Output: 2
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // Function to check whether it contains even or not
    static boolean even(int num) {
        int NumberOfDigits = digit(num);
        return NumberOfDigits % 2 == 0;
    }

    // Helper function to count number of digits in a number
    static int digit(int num) {
        if (num < 0) {
            num = num * -1;
        }
        // Edge case: 0 has 1 digit
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
