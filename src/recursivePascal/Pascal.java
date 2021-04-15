package recursivePascal;

import java.util.Arrays;

public class Pascal {
    int[][] triangle;

    public Pascal(int rows) {
        triangle = new int[rows][];

        for (int i = 0; i < rows; ++i) {
            triangle[i] = new int[i+1];
        }

        for (int i = 0; i < rows; ++i) {
            triangle[i][0] = 1;
            triangle[i][triangle[i].length - 1] = 1;
        }
        //fill();
        recursiveFill();
    }

    public void recursiveFill() {
        for (int row = 1; row < triangle.length; ++row) {
            for (int col = 1; col < triangle[row].length - 1; ++col) {
                if (triangle[row][col] == 0)
                    triangle[row][col] = triangle[row - 1][col - 1] + triangle[row - 1][col];
            }
        }
    }

    public int recursiveGet(int r, int c) {
        if (triangle[r][c] != 0)
            return triangle[r][c];
        else
            return recursiveGet(r - 1, c) + recursiveGet(r - 1, c - 1);
    }

    public void fill() {
        for (int row = 1; row < triangle.length; ++row) {
            for (int col = 1; col < triangle[row].length - 1; ++col) {
                if (triangle[row][col] == 0)
                    triangle[row][col] = triangle[row - 1][col - 1] + triangle[row - 1][col];
            }
        }
    }

    @Override
    public String toString() {
        String out = "";

        for (int[] row : triangle) {
            System.out.println(Arrays.toString(row));
        }

        return out;
    }
}
