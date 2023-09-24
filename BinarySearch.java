import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 324, 46, 56, 7, 6, 7, 34, 5, 4, 546, 7, 3 };
        Arrays.sort(arr);

        System.out.println(binarySearch(arr, 3));
    }

    static boolean binarySearch (int[] arr, int key) {

        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            // when the elment is middle
            if (arr[mid] == key) {
                return true;
            }

            // compare the element left of mid if mid is smaller than key
            if (key < arr[mid]) {
                end = mid - 1;
            }

            // compare the element right of mid if mid is greater than key
            if (key > arr[mid]) {
                start = mid + 1;
            }

        }

        return false;

    }

}
