package Problem58;

import java.util.Arrays;

public class ClosestToZeroPair {
    public static void main(String[] args) {
        int[] arr = {1, 60, -10, 70, -80, 85};
        findClosestToZeroPair(arr);
    }

    public static void findClosestToZeroPair(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array must contain at least two elements");
            return;
        }

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        int minSum = Integer.MAX_VALUE;
        int minLeft = left;
        int minRight = right;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                minLeft = left;
                minRight = right;
            }

            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("The pair whose sum is closest to zero is: (" + arr[minLeft] + ", " + arr[minRight] + ")");
    }
}

