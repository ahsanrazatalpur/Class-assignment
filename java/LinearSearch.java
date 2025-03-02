Public class LinearSearch {
    // Function to perform linear search
    Public static int linearSearch(int[] arr, int target) {
        For (int i = 0; i< arr.length; i++) {
            If (arr[i] == target) {
                Return i; // Return index if target is found
            }
        }
        Return -1; // Return -1 if target is not found
    }

    // Main method to test the linear search
    Public static void main(String[] args) {
        Int[] arr = { 10, 20, 30, 40, 50 };
        Int target = 30;
        Int result = linearSearch(arr, target);
        If (result != -1) {
            System.out.println("Element found at index: "+ result);
        } else {
            System.out.println(“Element not found”);
        }
    }
}