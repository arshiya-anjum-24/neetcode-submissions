class Solution {
    public static void findCombinations(int[] candidates, int target, List<Integer> ans, List<List<Integer>> res, int i){
        if(target==0){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int a=i;a<candidates.length;a++){
            if(a>i && candidates[a]==candidates[a-1]){
                continue;
            }
            if(candidates[a]<=target){
                ans.add(candidates[a]);
                findCombinations(candidates,target-candidates[a],ans,res,a+1);
                ans.remove(ans.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> ans= new ArrayList<>();
        List<List<Integer>> res= new ArrayList<>();
        findCombinations(candidates,target, ans, res, 0);
        return res;
    }
}
