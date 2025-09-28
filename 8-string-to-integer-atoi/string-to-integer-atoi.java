class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if (s.isEmpty()) return 0;

        int i=0;
        int sign=1;
        long num=0;
         if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            i++;
        }

        for(;i<s.length();i++){
            char c=s.charAt(i);
            if(!Character.isDigit(c)) break;

            num=num*10+(c-'0');

            if (sign * num > Integer.MAX_VALUE) return Integer.MAX_VALUE; 
            if (sign * num < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        }

        return (int)(sign*num);
    }
}