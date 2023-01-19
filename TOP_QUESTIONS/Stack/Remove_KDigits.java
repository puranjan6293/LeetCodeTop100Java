package TOP_QUESTIONS.Stack;

import java.util.Stack;

public class Remove_KDigits {
    public String removeKdigits(String s, int k) {
        //Edge cases
        if(k==s.length()) return "0";

        //create a stack
        Stack<Character> st = new Stack<>();
        int i=0;
        while(i<s.length()){
            //whenever meet a digit which is lessthan the previous, discard the digit
            while(k>0 && !st.isEmpty() && st.peek()>s.charAt(i)){
                st.pop();
                k--;
            }
            //push to stack
            st.push(s.charAt(i));
            i++;
        }

        //Edge case for like 1111 or 4444
        while(k>0){
            st.pop();
            k--;
        }

        //constructing the number from the the string using StringBuilder
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        //we have to reverse the string because stack works on lifo
        sb.reverse();

        //remove all the zeros from the head;
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }

        //return the string 
        return sb.toString();
    }
}
