import java.util.*;
public class productarray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll("[\\[\\]]","");
        String[] ch=s.split(",");
        int[] arr=new int[ch.length];
        for(int i=0;i<ch.length;i++){
            arr[i]=Integer.parseInt(ch[i]);
        }
        product(arr);
    }
    public static void product(int[] arr){
        int n=arr.length;
        int[] res=new int[n];
        res[0]=1;
        for(int i=1;i<n;i++){
            res[i]=res[i-1]*arr[i-1];
        }
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            res[i]=res[i]*suffix;
            suffix*=arr[i];
        }
        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(res[i]);
            if(i<n-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
