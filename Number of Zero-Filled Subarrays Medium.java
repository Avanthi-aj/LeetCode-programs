class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0,ans=0;
        for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    count++;
                    ans+=count;
                } 
                else {
                    count=0;
                }
        }
        return ans;
    }
}
