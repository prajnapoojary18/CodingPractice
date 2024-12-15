package Problem77;

import java.util.Arrays;

public class CircularRotation {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int k=3;

        System.out.println("original Array"+ Arrays.toString(arr));
        int[] rotatedArray =rotateArray(arr,k);
        System.out.println("Array After "+k+" rotations: "+ Arrays.toString(rotatedArray));
    }
    public static int[] rotateArray(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        int[] rotated =new int[n];
        for(int i=0;i<k;i++){
            rotated[i]=arr[n-k+i];
        }
        for(int i=k;i<n;i++){
            rotated[i]=arr[i-k];
        }
        return rotated;
    }
}
