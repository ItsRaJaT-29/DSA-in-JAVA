
public class Q1 {

    // Search in the Array : Return the index if item Found
    // Otherwise if item not found Return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // For loop to array check
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
        }
    }
        // Return -1 only after checking the entire array
        return Integer.MAX_VALUE;
}

    // Search in the Array : Return the element that item Found
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // For loop to array check
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        // Return -1 only after checking the entire array
        return Integer.MAX_VALUE;
    }


    // Search in the Array : If found then return True of False
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // For loop to array check
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // Return -1 only after checking the entire array
        return false;
    }


    public static void main(String[] args) {
    int [] arr = {18,12,9,14,77,50};
    int result1 = linearSearch(arr,14);
    int result2 = linearSearch2(arr,14);
    boolean result3 = linearSearch3(arr,14);

    System.out.println("Is Index Found : " + result3);
    System.out.println("Found the element : " +result2);
    System.out.println("At Index : " + result1);

    }
}

