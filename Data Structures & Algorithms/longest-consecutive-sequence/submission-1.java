class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int l=1, maxL=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                continue;
            }
            else if(nums[i-1]+1==nums[i]){
                l++;
            }
            else{
                l=1;
            }
            maxL=Math.max(l,maxL);
        }
        return maxL;
    }
}
