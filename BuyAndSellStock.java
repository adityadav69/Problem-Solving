public class BuyAndSellStock {

    static int calculate(int arr[]){
        int buyingprice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>buyingprice){
                int profit=arr[i]-buyingprice;
                maxProfit=Math.max(maxProfit, profit);
            }
            else{
                buyingprice=arr[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[]= {7, 10, 1, 3, 6, 9, 2};
        System.out.println(calculate(arr));
    }
}
