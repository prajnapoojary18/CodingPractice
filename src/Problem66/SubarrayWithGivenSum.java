package Problem66;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int targetSum = 12;
        findSubarrayWithGivenSum(arr, targetSum);
    }

    public static void findSubarrayWithGivenSum(int[] arr, int targetSum) {
        int start = 0;
        int currentSum = arr[0];

        for (int end = 1; end <= arr.length; end++) {
            while (currentSum > targetSum && start < end - 1) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == targetSum) {
                System.out.println("Subarray found from index " + start + " to " + (end - 1));
                return;
            }

            if (end < arr.length) {
                currentSum += arr[end];
            }
        }

        System.out.println("No subarray with the given sum was found.");
    }
}

