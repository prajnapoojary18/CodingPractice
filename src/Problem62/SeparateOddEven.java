package Problem62;

public class SeparateOddEven {
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3};
        separateOddAndEven(arr);

        System.out.println("Array after separating odd and even numbers:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void separateOddAndEven(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }

            while (arr[right] % 2 == 1 && left < right) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}

