class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>,List<String>> map= new HashMap<>();
        for(String s:strs){
            Integer[] arr=new Integer[26];
            Arrays.fill(arr,0);
            for(int i=0;i<s.length();i++){
                int ascii=s.charAt(i)-'a';
                arr[ascii]++;
            }
            if(!map.containsKey(Arrays.asList(arr))){
                map.put(Arrays.asList(arr),new ArrayList<>());
            }
            map.get(Arrays.asList(arr)).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
