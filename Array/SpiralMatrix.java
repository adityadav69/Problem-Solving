public class SpiralMatrix {
    static void printMaxtrix(int arr[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            System.out.print("[ ");
            for (int j = 0; j < n; j++) {
                if (arr[i][j] < 10) {
                    System.out.print(arr[i][j] + "    ");
                } else {
                    System.out.print(arr[i][j] + "   ");
                }
            }
            System.out.println("] ");
        }
    }

    static void printSpiralMatrix(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;

        int startRow = 0;
        int endRow = m - 1;
        int startCol = 0;
        int endCol = n - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // Top

            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }

            // Right

            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }

            // Buttom
            if (startRow != endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(arr[endRow][j] + " ");
                }
            }
            // left

            if (startCol != endCol) {
                for (int i = endRow - 1; i >= startRow + 1; i--) {
                    System.out.print(arr[i][startCol] + " ");
                }
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

    }

    public static void main(String[] args) {
        // int arr[][] = { { 1, 2, 3,4 }, { 5, 6, 7,8 }, { 9, 10, 11,12 },{ 13, 14, 15,
        // 16 } };
        // int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
        printMaxtrix(arr, arr.length, arr[0].length);
        printSpiralMatrix(arr);
    }
}
