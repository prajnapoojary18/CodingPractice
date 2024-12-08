package Problem54;

public class EvenPositionElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};

        System.out.println("Elements at even positions are:");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}

