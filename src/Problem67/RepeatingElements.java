package Problem67;

import java.util.HashSet;
import java.util.Set;

public class RepeatingElements {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 4, 9, 6, 10, 11, 5};
        findRepeatingElements(arr);
    }

    public static void findRepeatingElements(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }

        System.out.println("Repeating elements in the array: " + duplicates);
    }
}

