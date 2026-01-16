class Solution {
    public List<String> generateParenthesis(int n) {
            List<String> list=new ArrayList<>();
            String s="";
            meth(list,s,0,0,n);
            return list;
    }

    private void meth(List<String> l,String s,int open,int close,int n){
        if(s.length()==n*2){
            l.add(s);
            return;
        }

        if(open<n){
            meth(l,s+"(",open+1,close,n);
        }

        if(close<open){
            meth(l,s+")",open,close+1,n);
        }
    }
}