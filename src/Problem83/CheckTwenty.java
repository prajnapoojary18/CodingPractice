package Problem83;

public class CheckTwenty {
    public static void main(String[] args) {
        int[] array = {20, 1, 20, 2, 3, 20, 4};
        boolean result = checkTwenty(array);
        if (result) {
            System.out.println("The value 20 appears three times and no two 20's are adjacent.");
        } else {
            System.out.println("The conditions are not met.");
        }
    }

    public static boolean checkTwenty(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 20) {
                count++;
                if (i > 0 && array[i - 1] == 20) {
                    return false;
                }
                if (i < array.length - 1 && array[i + 1] == 20) {
                    return false;
                }
            }
        }
        return count == 3;
    }
}

