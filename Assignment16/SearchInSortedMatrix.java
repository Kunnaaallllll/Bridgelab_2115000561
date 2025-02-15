public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 3, 5},
            {7, 10, 11},
            {12, 14, 16}
        };
        int target = 10;
        System.out.println(searchMatrix(arr, target));
    }
    public static boolean searchMatrix(int arr[][], int target) {
        int rows = arr.length;
        int cols = arr[0].length;
        int left = 0;
        int right = rows * cols - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int row = mid / cols;
            int col = mid % cols;
            if (arr[row][col] == target) {
                return true;
            }
            if (arr[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
