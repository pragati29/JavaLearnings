package programming2024.march;

import java.util.HashMap;
import java.util.Map;

public class TestPro {
    public static void main(String[] args) {
        int []nums={1, 2, 2, 3, 4, 4, 4, 5, 5};
        int temp[]=new int[nums.length];
        //nums={1,2,_}
       int j=0;
       int k=0;
        for(int i=0;i< nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
               nums[j++]=nums[i];
               k++;
            }
        }
        nums[j++]=nums[nums.length-1];
        for(int i=0;i< nums.length-k;i++){
            System.out.println(nums[i]);
        }
    }
}
