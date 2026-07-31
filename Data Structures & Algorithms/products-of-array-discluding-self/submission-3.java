class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int zeros=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                prod=prod*nums[i];
            }
            else{
                zeros++;
            }
        }
        int[] ans=new int[nums.length];
        if(zeros>1){
            Arrays.fill(ans,0);
            return ans;
        }
        for(int i=0;i<ans.length;i++){
            if(zeros==1){
                if(nums[i]==0){
                    ans[i]=prod;
                }
                else{
                    ans[i]=0;
                }
            } 
            else{
                ans[i]=prod/nums[i];
            }
        }
        return ans;
    }
}  
