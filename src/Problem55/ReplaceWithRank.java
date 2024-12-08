package Problem55;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReplaceWithRank {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 12, 11, 50, 25};
        int[] rankedArray = replaceWithRank(arr);

        System.out.println("Array with elements replaced by their ranks: ");
        System.out.println(Arrays.toString(rankedArray));
    }

    public static int[] replaceWithRank(int[] arr) {
        int n = arr.length;
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            rankMap.put(sortedArr[i], i + 1);
        }

        int[] rankedArr = new int[n];
        for (int i = 0; i < n; i++) {
            rankedArr[i] = rankMap.get(arr[i]);
        }

        return rankedArr;
    }
}

