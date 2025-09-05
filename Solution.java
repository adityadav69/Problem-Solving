import java.util.*;
class Solution {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0) return result;
  
        int startingRow = 0;                       // upar ka boundary
        int endingRow = matrix.length - 1;    // neeche ka boundary
        int startingColumn = 0;                      // startingColumn boundary
        int endingColumn = matrix[0].length - 1;  // endingColumn boundary

        while(startingRow <= endingRow && startingColumn <= endingColumn) {
            // startingColumn to endingColumn
            for(int i = startingColumn; i <= endingColumn; i++) {
                result.add(matrix[startingRow][i]);
            }
            startingRow++;

            // startingRow to endingRow
            for(int i = startingRow; i <= endingRow; i++) {
                result.add(matrix[i][endingColumn]);
            }
            endingColumn--;

            // endingColumn to startingColumn
            if(startingRow >= endingRow) {
                for(int i = endingColumn; i >= startingColumn; i--) {
                    result.add(matrix[endingRow][i]);
                }
                endingRow--;
            }

            // endingRow to startingRow
            if(startingColumn >= endingColumn) {
                for(int i = endingRow; i >= startingRow; i--) {
                    result.add(matrix[i][startingColumn]);
                }
                startingColumn++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
        System.out.println(spiralOrder(arr));
        
    }
}
