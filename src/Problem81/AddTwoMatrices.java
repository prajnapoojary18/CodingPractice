package Problem81;

public class AddTwoMatrices {
    public static void main(String[] args) {
        int[][] matrix1={
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        int[][]matrix2={
                {9,4,5},
                {4,6,2},
                {4,6,8}};
        int[][] sumMatrix=addMatrice(matrix1,matrix2);
        System.out.println("resultant Matrix after addition:");
        for (int[] matrix : sumMatrix) {
            for (int j = 0; j < sumMatrix.length; j++) {
                System.out.print(matrix[j] + ", ");
            }
            System.out.println();
        }
    }
    public static int[][] addMatrice(int[][] matrix1,int[][] matrix2){
        int rows= matrix1.length;
        int colms= matrix2.length;
        int[][] sumMatrix=new int[rows][colms];

        for(int i=0;i<rows;i++){
            for(int j=0;j<colms;j++){
                sumMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        return sumMatrix;
    }
}
