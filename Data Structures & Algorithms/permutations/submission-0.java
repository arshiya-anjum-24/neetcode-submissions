class Solution {
    public static void findPermutations(int[] nums, List<Integer> ans, List<List<Integer>> permutations, boolean[] visited){
        if(ans.size()==nums.length){
            permutations.add(new ArrayList<>(ans));
            return;
        }
        for(int a=0;a<nums.length;a++){
            if(visited[a]){
                continue;
            }
            visited[a]=true;
            ans.add(nums[a]);
            findPermutations(nums,ans, permutations,visited);
            ans.remove(ans.size()-1);
            visited[a]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        boolean[] visited= new boolean[nums.length];
        List<List<Integer>> permutations= new ArrayList<>();
        findPermutations(nums, ans, permutations, visited);
        return permutations;
    }
}
