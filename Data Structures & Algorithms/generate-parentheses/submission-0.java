class Solution {
    public static void returnParentheses(int n, int open, int close, StringBuilder ans,List<String> res){
        if(ans.length()==2*n){
            res.add(ans.toString());
            return;
        }
        if(open<n){
            ans.append('(');
            returnParentheses(n,open+1,close,ans,res);
            ans.deleteCharAt(ans.length()-1);
        }
        if(close<open){
            ans.append(')');
            returnParentheses(n,open,close+1,ans,res);
            ans.deleteCharAt(ans.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res= new ArrayList<>();
        returnParentheses(n,0,0,new StringBuilder(),res);
        return res;
    }
}
