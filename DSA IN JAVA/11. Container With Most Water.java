class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,ans=Integer.MIN_VALUE;
        while(l<r){
            int area=Math.min(height[l],height[r])*(r-l);
            ans=Math.max(area,ans);
            if(height[l]>height[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return ans;
    }
}
