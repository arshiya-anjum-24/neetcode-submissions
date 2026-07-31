class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            int max=Integer.MIN_VALUE;
            int maxKey=0;
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue()>max){
                    max=entry.getValue();
                    maxKey=entry.getKey();
                }
            }
            ans[i]=maxKey;
            map.put(maxKey,Integer.MIN_VALUE);
        }
        return ans;
    }
}
