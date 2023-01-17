package TOP_QUESTIONS.Stack;

import java.util.Stack;

public class Valid_Parentheses {
    public boolean isValid(String s) {
        /*
        //Approach: Using Stack
        //create a stack
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(a=='(' || a=='{' || a=='['){
                st.push(a);
            }
            else if(st.empty()) return false;
            else if(a==')' && st.pop()!='(') return false;
            else if(a=='}' && st.pop()!='{') return false;
            else if(a==']' && st.pop()!='[') return false;
        }
        return st.empty();
        */
        //After Optimization, T.C : O(n)
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(a=='(' || a=='{' || a=='['){
                st.push(a);
            }
            else if(a==')' && !st.empty() && st.peek()=='(') st.pop();
            else if(a=='}' && !st.empty() && st.peek()=='{') st.pop();
            else if(a==']' && !st.empty() && st.peek()=='[') st.pop();
            else return false;
        }
        return st.empty();
    }
}
