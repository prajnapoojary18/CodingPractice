package Problem85;

public class ReplaceWithNextGreatest {
    public static void main(String[] args) {
        int[] array = {16, 17, 4, 3, 5, 2};
        replaceElements(array);

        System.out.println("Array after replacement:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void replaceElements(int[] array) {
        int n = array.length;
        int maxFromRight = -1;

        for (int i = n - 1; i >= 0; i--) {
            int current = array[i];
            array[i] = maxFromRight;
            if (current > maxFromRight) {
                maxFromRight = current;
            }
        }
    }
}

