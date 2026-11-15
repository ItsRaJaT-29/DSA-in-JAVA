
public class Q1 {

    // Search in the Array : Return the index if item Found
    // Otherwise if item not found Return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // For loop to array check
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Target Array found at : " + i);
                return i;
        }
    }
        // Return -1 only after checking the entire array
        return -1;
}

    public static void main(String[] args) {
    int [] arr = {18,12,9,14,77,50};
    linearSearch(arr,14);
    }
}

