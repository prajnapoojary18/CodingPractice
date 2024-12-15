package Problem79;

import java.util.Arrays;

public class tripletSum {
    public static void main(String[] args) {
        int[] arr={1,4,45,6,10,8};
        int targetSum=22;

        if(true) {
            System.out.println("Triplet Found:" + findTriplet(arr, targetSum));
        }else
            System.out.println("Triplet Found:"+findTriplet(arr,targetSum));
    }
    public static boolean findTriplet(int[] arr,int targetSum){
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int left=i+1;
            int right=n-1;

            while(left< right) {
                int currentSum=arr[i]+arr[left]+arr[right];
                if(currentSum==targetSum){
                    System.out.println("Triplet found "+ arr[i]+" , "+arr[left]+ " , "+arr[right]);
                    return true;
                }
                else if(currentSum<targetSum){
                    left++;
                }else{
                    right--;
                }
            }

        }
        System.out.println("No Triplet found");
        return false;
    }
}
