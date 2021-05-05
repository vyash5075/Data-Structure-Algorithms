/*
Input: path = "/a/./b/../../c/"
Output: "/c"
*/

class Solution {
    public String simplifyPath(String A) {
      
        Stack<String> st = new Stack<String>();
 
        String res = "";
        res += "/";
        int len_A = A.length();
 
        for (int i = 0; i < len_A; i++)
        {
            String dir = "";
            while (i < len_A && A.charAt(i) == '/')
                i++;
            while (i < len_A && A.charAt(i) != '/')
            {
                dir += A.charAt(i);
                i++;
            }
            System.out.println("v"+dir);
            if (dir.equals("..") == true)
            {
                if (!st.empty())
                    st.pop();    
            }
            else if (dir.equals(".") == true)
                continue;
            else if (dir.length() != 0){
                System.out.println(dir);
                st.push(dir);
        }
        }
        Stack<String> st1 = new Stack<String>();
        while (!st.empty())
        {
             
            st1.push(st.pop());
            // st.pop();
        }
         
 
        // the st1 will contain the actual res.
        while (!st1.empty())
        {
             
            // if it's the last element no need
            // to append "/"
            if (st1.size() != 1)
                res += (st1.pop() + "/");
            else
                res += st1.pop();
 
            // st1.pop();
        }
        return res;   
    }
}
