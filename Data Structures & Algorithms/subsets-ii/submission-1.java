class Solution {
    public static void findSubsets(int[] nums, List<Integer> ans, List<List<Integer>> res, int i){
        res.add(new ArrayList<>(ans));
        for(int a=i;a<nums.length;a++){
            if(a>i && nums[a]==nums[a-1]){
                continue;
            }
            ans.add(nums[a]);
            findSubsets(nums,ans,res,a+1);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans= new ArrayList<>();
        List<List<Integer>> res= new ArrayList<>();
        findSubsets(nums,ans,res,0);
        return res;
    }
}
