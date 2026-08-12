class Solution {
    public static void findCombinations(int[] nums, int target, List<Integer> ans, List<List<Integer>> res, int sum, int i){
        if(sum==target){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int a=i;a<nums.length;a++){
            if(sum+nums[a]<=target){
                ans.add(nums[a]);
                findCombinations(nums,target,ans,res,sum+nums[a],a);
                ans.remove(ans.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> ans= new ArrayList<>();
        List<List<Integer>> res= new ArrayList<>();
        findCombinations(nums, target, ans, res, 0,0);
        return res;
    }
}
