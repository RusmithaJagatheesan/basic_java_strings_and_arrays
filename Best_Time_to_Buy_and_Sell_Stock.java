import java.util.*;
public class stockbuy{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll("[\\[\\]]","");
        String[] ch=s.split(",");
        int[] prices=new int[ch.length];
        for(int i=0;i<ch.length;i++){
            prices[i]=Integer.parseInt(ch[i]);
        }
        System.out.print(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int n=prices.length;
        int maxprofit=0;
        int min=prices[0];
        for(int i=0;i<n;i++){
            if(prices[i]<min)
            min=prices[i];
            int profit=prices[i]-min;
            if(profit>maxprofit)
            maxprofit=profit;
        }
        return maxprofit;
    }
}
