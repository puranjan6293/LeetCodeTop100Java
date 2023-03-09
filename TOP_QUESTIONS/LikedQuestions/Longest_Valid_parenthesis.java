package TOP_QUESTIONS.LikedQuestions;
import java.util.*;
public class Longest_Valid_parenthesis {
    public int longestValidParentheses(String s) {
        //Approach: using Stack, T.C: O(n), S.C: O(n)
        Stack<Integer> st = new Stack<>();
        //initially push -1 to stack for reference
        st.push(-1);
        int max = 0;

        //iterate the string
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(c=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.empty()){
                    st.push(i);
                }
                else{
                    max = Math.max(max, i-st.peek());
                }
            }
        }
        return max;
    }
}
