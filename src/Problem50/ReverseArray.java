package Problem50;

public class ReverseArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int[] reversedArray=reverseArray(a);
        System.out.println("Reversed Array: ");
        for(int i=0;i<reversedArray.length;i++){
            System.out.print(reversedArray[i]+ "\t");
        }
    }
    public static int[] reverseArray(int a[]){
        int n=a.length;
        int[] reversed=new int[n];

        for(int i=0;i<n;i++){
             reversed[i] = a[n - 1 -i];
        }return reversed;
    }
}
