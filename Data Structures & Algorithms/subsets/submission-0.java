class Solution {
    public static void findSubsets(int[] nums, List<Integer> ans, List<List<Integer>> res, int i){
        if(i==nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[i]);
        findSubsets(nums,ans,res,i+1);
        ans.remove(ans.size()-1);
        findSubsets(nums,ans,res,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> res= new ArrayList<>();
        findSubsets(nums, ans, res, 0);
        return res;
    }
}
