package Problem61;

public class SeparateZerosOnes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 0, 1};
        separateZerosAndOnes(arr);

        System.out.println("Array after separating 0s and 1s:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void separateZerosAndOnes(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] == 0 && left < right) {
                left++;
            }

            while (arr[right] == 1 && left < right) {
                right--;
            }

            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }
}

