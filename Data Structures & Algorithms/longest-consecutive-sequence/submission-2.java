class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> set= new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int maxL=0;
        int l=0;
        for(int n:nums){
            if(!set.contains(n-1)){
                l=1;
                while(set.contains(n+1)){
                    l++;
                    n++;
                }
            }
            maxL=Math.max(maxL,l);
        }
        return maxL;
    }
}
