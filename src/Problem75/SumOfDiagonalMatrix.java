package Problem75;

import java.util.ArrayList;
import java.util.List;

public class SumOfDiagonalMatrix {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 5},
                     {4, 5, 6, 3},
                     {7, 8, 9, 7},
                     {2, 5, 8, 4},
        };
        List<Integer> sumOfDiagonalElements = sumOfDiagonalMatrix(a);

        System.out.println("Principle Sum Of Diagonal Elements: "+sumOfDiagonalElements.get(0));
        System.out.println("Secondary Sum Of Diagonal Elements: "+sumOfDiagonalElements.get(1));
        }

    public static  List<Integer> sumOfDiagonalMatrix(int[][] a) {
        int principalDiagonal=0;
        int secondaryDiagonal=0;
        List<Integer> sum=new ArrayList<>();
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    principalDiagonal += a[i][j];
                }

                if (i + j == n - 1) {
                    secondaryDiagonal += a[i][j];
                }
            }
        }
                    sum.add(principalDiagonal);
                    sum.add(secondaryDiagonal);
            return sum;
    }
}
