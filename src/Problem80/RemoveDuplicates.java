package Problem80;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr={1,2,3,2,4,5,2,7,6,4};
        System.out.println("original Array:"+Arrays.toString(arr));

        int[] result=removeDuplicates(arr);
        System.out.println("Array after removing duplicate:"+Arrays.toString(result));
    }
    public static int[] removeDuplicates(int[] arr){
    Set<Integer> set=new LinkedHashSet<>();
    for(int num:arr){
        set.add(num);
    }
    int[] result = new int[set.size()];
    int i=0;for(int num: set){
        result[i++]=num;
    }
        return result;
     }
}
