package Problem59;

public class ClosestSumPair {
    public static void main(String[] args) {
        int[] arr = {10, 22, 28, 29, 30, 40};
        int x = 54;
        findClosestSumPair(arr, x);
    }

    public static void findClosestSumPair(int[] arr, int x) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array must contain at least two elements");
            return;
        }

        int left = 0;
        int right = arr.length - 1;
        int closestSum = Integer.MAX_VALUE;
        int closestPairLeft = left;
        int closestPairRight = right;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (Math.abs(x - sum) < Math.abs(x - closestSum)) {
                closestSum = sum;
                closestPairLeft = left;
                closestPairRight = right;
            }

            if (sum < x) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("The pair whose sum is closest to " + x + " is: (" + arr[closestPairLeft] + ", " + arr[closestPairRight] + ")");
    }
}

