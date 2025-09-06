public class PascalTriangle {

    static int calculateFactorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    
    static int printParticularElement(int row,int column){
      
        row=row-1;
        column=column-1;
        int numerator=1;
        int denominator=1;
        for(int i=0;i<column;i++){
          
            numerator=numerator*(row-i);
            denominator=denominator*(i+1);
            
        }

        return numerator/denominator;
        
    }
    public static void main(String[] args) {
        System.out.println(printParticularElement(6, 6));
    }
}
