package Problem65;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 4};
        countOccurrences(arr);
    }

    public static void countOccurrences(int[] arr) {
        int n = arr.length;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println(arr[i - 1] + " occurs " + count + " times");
                count = 1;
            }
        }
        System.out.println(arr[n - 1] + " occurs " + count + " times");
    }
}
