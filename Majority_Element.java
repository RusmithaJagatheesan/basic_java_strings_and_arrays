import java.util.*;
public class majorityelement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll("[\\[\\]]","");
        String[] ch=s.split(",");
        int[] arr=new int[ch.length];
        for(int i=0;i<ch.length;i++){
            arr[i]=Integer.parseInt(ch[i]);
        }
        System.out.print(majority(arr));
    }
    public static int majority(int[] nums){
        int num=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==num){
                count++;
            }
            else{
                count--;
                if(count==0){
                num=nums[i];
                count=1;
                }
            }
        }
        return num;
    }
}
