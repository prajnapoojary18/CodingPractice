package Problem63;

public class MissingNumberInAP {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 10, 12};
        int missingNumber = findMissingNumber(arr);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length;
        int totalElements = n + 1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        int d = (max - min) / totalElements;

        int expectedSum = totalElements * (min + max) / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}

