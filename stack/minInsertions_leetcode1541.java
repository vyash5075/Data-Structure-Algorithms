Input: s = "))())("
Output: 3
Explanation: Add '(' to match the first '))', Add '))' to match the last '('.

class Solution {
    public int minInsertions(String s) {
        Stack<Character>st=new Stack<>();
        int insertionsneeded=0;
     
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                if(st.isEmpty()){
                    st.push(c);
                }
                else{
                    if(st.peek()!='('){
                        insertionsneeded++;
                        st.pop();
                        st.pop();
                    }
                    st.push(c);
                }
            }
            else{
                if(st.isEmpty()){
                    insertionsneeded++;
                    st.push('(');
                    st.push(c);
                    
                }
                else{
                    if(st.peek()=='('){
                        st.push(c);
                    }
                    else{
                        st.pop();
                        st.pop();
                    }
                    
                }
            }
        }
        if(st.isEmpty()){
            return insertionsneeded;
        }
        else{
            while(!st.isEmpty()){
               char c= st.pop();
                if(c=='('){
                    insertionsneeded+=2;
                }else{
                    insertionsneeded++;
                    st.pop();
                }
            }
        }
        return insertionsneeded;
        
    }
}
