package Problem76;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckForSubstring {
            public static boolean isSubsetUsingHashing(int[] arr1,
                                                       int[] arr2)
            {
                Set<Integer> hashSet = new HashSet<>();
                for (int num : arr1) {
                    hashSet.add(num);
                }

                for (int num : arr2) {
                    if (!hashSet.contains(num)) {
                        return false;
                    }
                }

                return true;
            }

            public static void main(String[] args)
            {
                int[] arr1 = { 11, 1, 13, 21, 3, 7 };
                int[] arr2 = { 11, 1,3, 7 };

                if (isSubsetUsingHashing(arr1, arr2)) {
                    System.out.println("Yes, Array2 is a subset of Array1");
                }
                else {
                    System.out.println("No, Array2 is not a subset of Array1");
                }
            }
        }



