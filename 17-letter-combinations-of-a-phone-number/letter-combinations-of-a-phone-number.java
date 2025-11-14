class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        if (digits == null || digits.length() == 0) return list;

        Map<Character,String> maps=new HashMap<>();
        maps.put('2', "abc");
        maps.put('3', "def");
        maps.put('4', "ghi");
        maps.put('5', "jkl");
        maps.put('6', "mno");
        maps.put('7', "pqrs");
        maps.put('8', "tuv");
        maps.put('9', "wxyz");

        for(int i=0;i<digits.length();i++){
            if(!maps.containsKey(digits.charAt(i))) return list;
        }

        list.add("");
        for(int i=0;i<digits.length();i++){
            char c=digits.charAt(i);
            String letter=maps.get(c);
            List<String> temp=new ArrayList<>();
            for(String str:list){
                for(int j=0;j<letter.length();j++){
                    temp.add(str+letter.charAt(j));
                }
            }
            list=temp;
        }

        return list;
    }
}