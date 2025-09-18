public class MakeMatrixZero {

    static void printMaxtrix(int arr[][]) {
        for (int i = 0; i < 4; i++) {
            System.out.print("[ ");
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("] ");
        }
    }

    static void makeRowZero(int arr[][],int i){
        for(int j=0;j<4;j++){
            arr[i][j]=-1;
        }
    }

    static void makeColoumnZero(int arr[][],int j){
        for(int i=0;i<4;i++){
            arr[i][j]=-1;
        }
    }
    static void MakeZero(int arr[][]){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(arr[i][j]==0){
                    makeRowZero(arr,i);
                    makeColoumnZero(arr,j);
                }
            }
        }
        System.out.println("After Making -1");
        // printMaxtrix(arr);

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }

        printMaxtrix(arr);
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 1, 1, 1 }, { 1, 0, 1, 1 }, { 1, 1, 0, 1 }, { 1, 0, 0, 1 } };
        printMaxtrix(arr);
        MakeZero(arr);

    }
}
