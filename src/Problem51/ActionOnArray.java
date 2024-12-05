package Problem51;

public class ActionOnArray{
    public static int[] moveElementToEnd(int []array, int toMove)
    {
        int i = 0;
        int j = array.length - 1;

        while (i < j)
        {
            while (i < j && array[j] == toMove)
                j--;
            if (array[i] == toMove)
                swap(array, i, j);
            i++;
        }
        return array;
    }

    public static int[] swap(int []arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static void main(String[] args)
    {
        int []arr = { 4,6,0,2,0,7,5,0,6};
        int K = 0;
        int []ans = moveElementToEnd(arr, K);

        for(int i = 0; i < arr.length; i++)
            System.out.print(ans[i] + " ");
    }
}

