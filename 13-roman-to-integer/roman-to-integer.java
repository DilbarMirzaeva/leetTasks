class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> roman=new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int num=0;
        char[] chars=s.toCharArray();

        for(int i=0;i<chars.length;i++){
            int current = roman.get(chars[i]);

            if(i<chars.length-1){
                int next=roman.get(chars[i+1]);

                if(current<next){
                num-=current;
                continue;
                }
            }

            num+=current; 
        }
        return num;
    }
}