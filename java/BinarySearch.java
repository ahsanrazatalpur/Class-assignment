public class BinarySearch {
    // Function to perform binary search
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }
            // If target greater, ignore left half
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        // If we reach here, then the element was not present
        return -1;
    }

    // Main method to test the binary search
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
 uu       int target = 30;
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}