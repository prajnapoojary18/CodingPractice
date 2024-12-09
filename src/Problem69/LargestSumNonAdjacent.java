package Problem69;

public class LargestSumNonAdjacent {
    public static void main(String[] args) {
        int[] arr = {3, 2, 7, 10};
        int result = findLargestSumNonAdjacent(arr);
        System.out.println("The largest sum of non-adjacent numbers is: " + result);
    }

    public static int findLargestSumNonAdjacent(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        if (arr.length == 1) {
            return arr[0];
        }

        int incl = arr[0];
        int excl = 0;

        for (int i = 1; i < arr.length; i++) {
            int newExcl = Math.max(incl, excl);
            incl = excl + arr[i];
            excl = newExcl;
        }

        return Math.max(incl, excl);
    }
}

