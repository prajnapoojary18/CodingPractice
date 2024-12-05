package Problem52;

public class MinMaxInArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        int[] minMax = findMinMax(arr);
        System.out.println("Smallest element in array: " + minMax[0]);
        System.out.println("Largest element in array: " + minMax[1]);
    }

    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new int[]{min, max};
    }
}

