public class PascalTriangle {

    static void printParticularRow(int row){
        for(int i=1;i<=row;i++){
            System.out.print(printParticularElement(row, i)+" ");
        }
    }
    
    static int printParticularElement(int row,int column){
      
        row=row-1;
        column=column-1;
        int result=1;
        for(int i=0;i<column;i++){
          
            result=result*(row-i);
            result=result/(i+1);
            
        }

        return result;
        
    }
    public static void main(String[] args) {
        System.out.println(printParticularElement(6, 4));
        printParticularRow(14);
    }
}
