import java.util.ArrayList;

public class PascalTriangle {

    static ArrayList<Integer> printParticularRow(int row){
        ArrayList <Integer> list=new ArrayList<>();
        int ans=1;
        list.add(ans);
        for(int i=1;i<row;i++){
            // System.out.print(printParticularElement(row, i)+" ");
            ans=ans*(row-i);
            ans=ans/(i);
            list.add(ans);
        }
        return list;
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
        // System.out.println(printParticularElement(6, 4));
        System.out.println(printParticularRow(6));
    }
}
