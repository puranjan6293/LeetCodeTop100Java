package TOP_QUESTIONS.Stack;

import java.util.Stack;

public class Longest_Valid_Parentheses {
    public int longestValidParentheses(String s) {
        Stack<Integer> st =new Stack<>();
        st.push(-1);
        int max=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.empty()){
                    st.push(i);
                }
                else{
                    max=Math.max(max,i-st.peek());
                }
            } 
        }
        return max;
    }
}
