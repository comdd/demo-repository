package com.example.algorithm;


/**
 * Description :
 *
 * @author : dd
 */
public class EightQueen {
    private static final int QUEENNUM = 1;
    private static int sum = 0;

    public int sumEigthQueen(int n) {
        if (n <= 1) {
            return n;
        }
        int[][] arrays = new int[n][n];
        setQueenIndex(arrays, n, 0);
        return sum;
    }

    private void setQueenIndex(int[][] arrays, int length, int k) {
        if (k == length) {
            ++sum;
            return ;
        }
        for (int col = 0; col < length; col++) {
            if (!hasQueen(arrays, k, col, length)) {
                arrays[k][col] = QUEENNUM;
                setQueenIndex(arrays, length, k + 1);
                arrays[k][col] = 0;
            }
        }
    }

    private boolean hasQueen(int[][] arrays, int row, int col, int length) {
        //正上方是否有皇后
        for (int i = row - 1; i >= 0; i--) {
            if (arrays[i][col] == 1)
                return true;
        }
        //右上对角线是否有queen
        for (int i = row - 1, j = col + 1; i >= 0 && j < length; i--, j++) {
            if (arrays[i][j] == 1)
                return true;
        }
        //左上对角线是否有queen
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (arrays[i][j] == 1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        EightQueen eightQueen = new EightQueen();
        System.out.println(eightQueen.sumEigthQueen(4));
    }
}
