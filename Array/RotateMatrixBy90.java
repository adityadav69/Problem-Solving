public class RotateMatrixBy90 {

    static void printMaxtrix(int arr[][]) {
        for (int i = 0; i < 4; i++) {
            System.out.print("[ ");
            for (int j = 0; j < 4; j++) {
                if (arr[i][j] < 10) {
                    System.out.print(arr[i][j] + "    ");
                } else {
                    System.out.print(arr[i][j] + "   ");
                }
            }
            System.out.println("] ");
        }
    }

    static void rotate(int arr[][]) {
        int n = arr.length;
        for(int i=0;i<arr.length-2;i++){
        for(int j=i+1;j<arr[0].length;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
      }

       for (int i = 0; i < n; i++) {
        int left = 0, right = n - 1;
        while (left < right) {
            int temp = arr[i][left];
            arr[i][left] = arr[i][right];
            arr[i][right] = temp;
            left++;
            right--;
        }
    }

      System.out.println();

      printMaxtrix(arr);
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        printMaxtrix(arr);
        rotate(arr);
    }
}
