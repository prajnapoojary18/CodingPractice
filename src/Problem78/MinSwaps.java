package Problem78;

import java.util.Arrays;
import java.util.Comparator;

public class MinSwaps {
    public static void main(String[] args) {
        int[] arr={4,3,5,2,1};
        System.out.println("Minimum swaps required: "+ minSwapsToSort(arr));
    }
    public static int minSwapsToSort(int[] arr){
        int n=arr.length;
        int[][] arrPos=new int[n][2];
        for(int i=0;i<n;i++){
            arrPos[i][0]=arr[i];
            arrPos[i][1]=i;
        }
        Arrays.sort(arrPos, Comparator.comparingInt(o->o[0]));
        boolean[] visited=new boolean[n];
        int swaps=0;
        for(int i=0;i<n;i++)
        {
            if(visited[i]||arrPos[i][1]==i){
                continue;
            }
            int cycleSize=0;
            int j=i;

            while(!visited[j]){
                visited[j]=true;
                j=arrPos[j][1];
                cycleSize++;
            }
            if(cycleSize>1){
                swaps+=cycleSize-1;
            }
        }return swaps;
    }
}
