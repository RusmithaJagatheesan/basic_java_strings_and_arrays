import java.util.*;
public class buyandsell{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll("[\\[\\]]","");
        String[] ch=s.split(",");
        int[] arr=new int[ch.length];
        for(int i=0;i<ch.length;i++){
            arr[i]=Integer.parseInt(ch[i]);
        }
        System.out.print(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int maxprofit=0;
        int n=prices.length;
        for(int i=0;i<n-1;i++){
            if(prices[i]<prices[i+1]){
                maxprofit=maxprofit-prices[i]+prices[i+1];
            }
        }
        return maxprofit;
    }
}
