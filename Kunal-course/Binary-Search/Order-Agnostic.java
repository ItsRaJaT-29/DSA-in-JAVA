public class Order_Agnostic {
    static int BS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //Find whether the array is sorted in ascending or Descending order
        boolean isASC = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isASC) {
                if (target < arr[mid]) {
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

        public static void main (String[]args){
            int[] asc = {1, 2, 3, 9, 12, 45, 67, 98, 99, 122};
            int[] desc = {122, 99, 98, 67, 45, 12, 9, 3, 2, 1};
            int[] single = {42};
            int[] duplicates = {5, 5, 5, 5};

            System.out.println("Ascending (found): " + BS(asc, 67));          // 6
            System.out.println("Descending (found): " + BS(desc, 67));        // 3
            System.out.println("Not found: " + BS(asc, 50));                  // -1
            System.out.println("Single element (found): " + BS(single, 42));  // 0
            System.out.println("Duplicates (found): " + BS(duplicates, 5));   // 1
        }
    }

