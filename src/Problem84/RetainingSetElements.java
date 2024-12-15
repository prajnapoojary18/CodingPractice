package Problem84;

import java.util.HashSet;
import java.util.Set;

public class RetainingSetElements {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);
        System.out.println("set1 " + set1);
        Set<Integer> set2 = new HashSet<>();
        set2.add(90);
        set2.add(50);
        set2.add(20);
        set2.add(70);
        set2.add(80);
        System.out.println("set2 " + set2);
        retainingMethod(set1,set2);
        System.out.println("retained set "+set1);
    }
    public static Set<Integer> retainingMethod(Set<Integer> set1,Set<Integer> set2){
        set1.retainAll(set2);
        return set1;
    }
}
