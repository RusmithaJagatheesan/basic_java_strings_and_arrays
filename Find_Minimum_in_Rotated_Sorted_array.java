import java.util.*;
public class searchmin{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll("[\\[\\]]","");
        String[] ch=s.split(",");
        int[] arr=new int[ch.length];
        for(int i=0;i<ch.length;i++){
            arr[i]=Integer.parseInt(ch[i]);
        }
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print(min);
    }
}
