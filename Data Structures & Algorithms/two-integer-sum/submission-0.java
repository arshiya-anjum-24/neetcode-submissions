class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        int diff;
        map.put(nums[0],0);
        for(int i=0;i<nums.length;i++){
            diff=target-nums[i];
            if(map.containsKey(diff) && !map.get(diff).equals(i)){
                ans[0]=map.get(diff);
                ans[1]=i;
                return ans;
                
            }
            else{
                map.put(nums[i],i);
            }
        }
        return ans;
    }
}
