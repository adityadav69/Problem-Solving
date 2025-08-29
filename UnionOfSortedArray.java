import java.util.ArrayList;

public class UnionOfSortedArray {

    static void union(int a[],int b[]){
        ArrayList <Integer> union=new ArrayList<>();
        int i=0;
        int j=0;
        while(i!=a.length && j!=b.length){
            if(a[i]<=b[j]){
                if(union.size()==0 || a[i]!=union.getLast()){
                    union.add(a[i]);
                }
                i++;
            }
            else{
                if(union.size()==0 || b[j]!=union.getLast()){
                    union.add(b[j]);
                }
                j++;
            }
        }
        
        while(i!=a.length){
            if(union.size()==0 || a[i]!=union.getLast()){
                    union.add(a[i]);
                }
                i++;
        }
         while(j!=b.length){
            if(union.size()==0 || b[j]!=union.getLast()){
                    union.add(b[j]);
                }
                j++;
        }

    System.out.println(union);
        
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,5};
        int arr2[]={2,3,4,4,5,6};
        union(arr,arr2);
    }
}
