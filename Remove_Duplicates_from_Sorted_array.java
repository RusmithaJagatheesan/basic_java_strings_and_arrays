import java.util.*;
public class duplicates{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll("[\\[\\]]","");
        String[] ch=s.split(",");
        int[] arr=new int[ch.length];
        for(int i=0;i<ch.length;i++){
            arr[i]=Integer.parseInt(ch[i]);
        }
        int m=removeDuplicates(arr);
        System.out.print("[");
        for(int i=0;i<m;i++){
            System.out.print(arr[i]);
            if(i<m-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
    public static int removeDuplicates(int[] nums) {
        int n=nums.length;
        int j=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
