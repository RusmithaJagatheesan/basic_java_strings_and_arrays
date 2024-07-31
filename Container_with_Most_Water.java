import java.util.*;
public class watercontainer{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll("[\\[\\]]","");
        String[] ch=s.split(",");
        int[] height=new int[ch.length];
        for(int i=0;i<ch.length;i++){
            height[i]=Integer.parseInt(ch[i]);
        }
        System.out.print(containswater(height));
    }
    public static int containswater(int[] height){
       int n=height.length;
       int l=0;
       int r=n-1;
       int max=0;
       while(l<r){
        int w=Math.min(height[l],height[r])*(r-l);
        max=Math.max(max,w);
        if(height[l]<height[r]){
            l++;
        }
        else{
            r--;
        }
       }
       return max;
    }
}
