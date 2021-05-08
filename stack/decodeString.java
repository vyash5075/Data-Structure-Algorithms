Input: s = "3[a]2[bc]"
Output: "aaabcbc
  
class Solution {
    public String decodeString(String s) {
       if (s == null || s.length() == 0) {
            return "";
        }
         
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
         
        String ans = "";
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    int digit = Character.getNumericValue(s.charAt(i));
                    num = num * 10 + digit;
                    i++;
                }
                 
                numStack.push(num);
            } else if (c == '[') {
                strStack.push(ans);
                i++;
                ans = "";
            } else if (c == ']') {
                int num = numStack.pop();
                StringBuilder sb = new StringBuilder(strStack.pop());
                for (int r = 0 ; r < num; r++) {
                    sb.append(ans);
                }
                 
                ans = sb.toString();
                i++;
            } else {
                ans += c;
                i++;
            }
        }
         
        return ans;
    }
}
