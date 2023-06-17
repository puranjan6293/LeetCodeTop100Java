import java.util.Scanner;
import java.util.Stack;

public class Valid_Parentheses {
    public static boolean isValid(String s) {
        //Approach: Using Stack
        Stack<Character> st = new Stack<>();
        //traverse through the string
        for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                st.push(c);
            }
            else if(c==')' && !st.isEmpty() && st.peek()=='(') st.pop();
            else if(c==']' && !st.isEmpty() && st.peek()=='[') st.pop();
            else if(c=='}' && !st.isEmpty() && st.peek()=='{') st.pop();
            else return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String s = sc.next();
        System.out.println("Is valid string: "+isValid(s));
    }
}
