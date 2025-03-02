import java.util.Arrays;

public class MatrixOperations {
    public static void main(String[] args) {
        int[][] matrixA = {
            {2, 1, 9},
            {4, 2, 4},
            {0, -6, 2}
        };

        int[][] matrixB = {
            {2, 1, 5},
            {2, 1, 8},
            {11, 4, 3}
        };

        System.out.println("Is Matrix A Unique: " + isUniqueMatrix(matrixA));
        System.out.println("Is Matrix A Square: " + isSquareMatrix(matrixA));
        System.out.println("Is Matrix A Periodic: " + isPeriodicMatrix(matrixA));
        System.out.println("Is Matrix A Hermitian: " + isHermitianMatrix(matrixA));
        System.out.println("Is Matrix A Nilpotent: " + isNilpotentMatrix(matrixA));
        System.out.println("Is Matrix A Idempotent: " + isIdempotentMatrix(matrixA));
        System.out.println("Is Matrix A Symmetric: " + isSymmetricMatrix(matrixA));
        System.out.println("Is Matrix A Asymmetric: " + isAsymmetricMatrix(matrixA));
        System.out.println("Is Matrix A Scalar: " + isScalarMatrix(matrixA));
        System.out.println("Is Matrix A Triangular: " + isTriangularMatrix(matrixA));
        System.out.println("Is Matrix A Diagonal: " + isDiagonalMatrix(matrixA));
        System.out.println("Is Matrix A Zero: " + isZeroMatrix(matrixA));

        System.out.println("Matrix Addition:");
        int[][] additionResult = matrixAddition(matrixA, matrixB);
        printMatrix(additionResult);

        System.out.println("Matrix Subtraction:");
        int[][] subtractionResult = matrixSubtraction(matrixA, matrixB);
        printMatrix(subtractionResult);

        System.out.println("Matrix Multiplication:");
        int[][] multiplicationResult = matrixMultiplication(matrixA, matrixB);
        printMatrix(multiplicationResult);

        System.out.println("Matrix Division:");
        int[][] divisionResult = matrixDivision(matrixA, matrixB);
        printMatrix(divisionResult);
    }

    public static boolean isUniqueMatrix(int[][] matrix) {
        boolean[] visited = new boolean[1001];
        for (int[] row : matrix) {
            for (int num : row) {
                if (visited[num]) {
                    return false;
                }
                visited[num] = true;
            }
        }
        return true;
    }

    public static boolean isSquareMatrix(int[][] matrix) {
        return matrix.length == matrix[0].length;
    }

    public static boolean isHermitianMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows != cols) {
            return false;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                if (matrix[i][j] != conjugate(matrix[j][i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isPeriodicMatrix(int[][] matrix) {
        int[][] result = matrix;
        int k = 2;
        while (!isEqual(matrix, result)) {
            result = matrixMultiply(result, matrix);
            k++;
        }
        return k > 2;
    }

    public static boolean isNilpotentMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = matrix;

        for (int k = 2; k <= rows + cols; k++) {
            result = matrixMultiply(result, matrix);
            if (isZeroMatrix(result)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isIdempotentMatrix(int[][] matrix) {
        int[][] product = matrixMultiply(matrix, matrix);
        return isEqual(matrix, product);
    }

    public static boolean isSymmetricMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isAsymmetricMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isZeroMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                if (num != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isTriangularMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < i && j < cols; j++) {
                if (matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isDiagonalMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isScalarMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int reference = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != reference) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] matrixMultiply(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static boolean isEqual(int[][] a, int[][] b) {
        return Arrays.deepEquals(a, b);
    }

    public static int conjugate(int num) {
        return -num;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixAddition(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    public static int[][] matrixSubtraction(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    public static int[][] matrixMultiplication(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] matrixDivision(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] / b[i][j];
            }
        }
        return result;
    }
}