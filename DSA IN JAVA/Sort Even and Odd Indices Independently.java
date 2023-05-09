import java.util.*;
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> e=new ArrayList<>();
        ArrayList<Integer> o=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                e.add(nums[i]);
            }
            else{
                o.add(nums[i]);
            }
        }
        Collections.sort(e);
        Collections.sort(o,Collections.reverseOrder());
        // int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=e.get(i/2);
            }
            else{
                nums[i]=o.get(i/2);
            }
        }
        return nums;
    }
}
