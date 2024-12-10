package Problem71;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumProduct
{
    public static void main(String[] args) {
        int[] num = {4, 6, 7, 3, 7, 9, 4, 5};
        Arrays.sort(num);
//        List<Integer> productList = productFind(num);
//        System.out.println("Products of Three consecutive numbers"+ productList);
//        Optional<Integer> maxProduct =productList.stream().max(Integer::compareTo);
//        System.out.println("Maximum Product:" + maxProduct);
        int maxProducts = findMaxProductOfThree(num);
        System.out.println("Maximum Product: " + maxProducts);

    }
//    public static List<Integer> productFind(int[] num){
//        System.out.println(num);
//        List<Integer> prod=new ArrayList<>();
//        if(num.length<3){
//            System.out.println("Array should be of length more than three");
//            return prod;
//        }
//        for(int i=0;i<num.length-2;i++){
//            int product=num[i]*num[i+1]*num[i+2];
//            prod.add(product);
//        }
//            return prod;
//    }

    public static int findMaxProductOfThree(int[] num) {
        int n = num.length;
        int product1 = num[n-1] * num[n-2] * num[n-3];
        int product2 = num[0] * num[1] * num[n-1];

        return Math.max(product1, product2);
}
}