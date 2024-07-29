import java.util.*;
public class rotatedarray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll("[\\[\\]]","");
        String[] ch=s.split(",");
        int[] arr=new int[ch.length];
        for(int i=0;i<ch.length;i++){
            arr[i]=Integer.parseInt(ch[i]);
        }
        int target=sc.nextInt();
        System.out.print(search(arr,target));
    }
    public static int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
