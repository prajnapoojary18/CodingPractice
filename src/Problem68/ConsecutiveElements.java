package Problem68;

import java.util.Arrays;

public class ConsecutiveElements {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5}; // Example array
        boolean result = areElementsConsecutive(arr);
        if (result) {
            System.out.println("The array elements are consecutive.");
        } else {
            System.out.println("The array elements are not consecutive.");
        }
    }

    public static boolean areElementsConsecutive(int[] arr) {
        if (arr.length < 2) {
            return true;
        }

        Arrays.sort(arr); // Step 1: Sort the array

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1] + 1) {
                return false;
            }
        }

        return true;
    }
}

