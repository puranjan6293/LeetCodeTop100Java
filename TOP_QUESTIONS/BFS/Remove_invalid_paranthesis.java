package TOP_QUESTIONS.BFS;

import java.util.*;

public class Remove_invalid_paranthesis {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();

        //sanity check
        if(s==null) return ans;

        HashSet<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        //initialize
        q.add(s);
        visited.add(s);

        boolean found = false;

        //traverse queue
        while(!q.isEmpty()){
            //remove from queue
            s = q.poll();

            //find an answer, add to the ans list
            if(isValid(s)){
                ans.add(s);
                found = true;
            }
            //leave if not found
            if(found) continue;

            //generate all posible states
            for(int i=0;i<s.length();++i){
                //we only try to remove left or right paranthesis
                if(s.charAt(i)!='(' && s.charAt(i)!=')') continue;

                //make a new string
                String t = s.substring(0,i) + s.substring(i+1);

                //remove duplicates
                if(!visited.contains(t)){
                    // for each state, if it's not visited, add it to the queue
                    q.add(t);
                    visited.add(t);
                }
            }
        }
        return ans;
    }
    // helper function checks if string s contains valid parantheses
    boolean isValid(String s){
        int count = 0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(') count++;
            if(c==')' && count--==0) return false;
        }
        return count==0;
    }
}
