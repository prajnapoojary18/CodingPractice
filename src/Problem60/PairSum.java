package Problem60;

import java.util.HashMap;
import java.util.Map;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int sum = 6;
        findPairsWithSum(arr, sum);
    }

    public static void findPairsWithSum(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println("Pairs with sum " + sum + ":");

        for (int num : arr) {
            int complement = sum - num;
            if (map.containsKey(complement)) {
                int count = map.get(complement);
                for (int i = 0; i < count; i++) {
                    System.out.println("(" + complement + ", " + num + ")");
                }
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    }
}

