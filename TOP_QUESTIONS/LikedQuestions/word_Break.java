package TOP_QUESTIONS.LikedQuestions;

import java.util.*;

public class word_Break {
    public boolean wordBreak(String s, List<String> wordDict) {
        /*
        //Approach: Using HashSet, Brute force, T.C: O(2^n)
        HashSet<String> set = new HashSet<>(wordDict);
        return helper(s, set);

    }
    public boolean helper(String s, HashSet<String> set){
        int len = s.length();
        if(len==0){
            return true;
        }
        for(int i=1;i<=len;++i){
            //check if the set contains the substring, if yes then call recursion for the substring
            if(set.contains(s.substring(0, i)) && helper(s.substring(i), set)){
                return true;
            }
        }
        return false;
    }
    */
    //Using Dp
    //convert to set
        HashSet<String> dict = new HashSet<>(wordDict);
        //using dp
        
        boolean[] flag = new boolean[s.length()+1];
        flag[0] = true;
        
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(flag[j] && dict.contains(s.substring(j,i))){
                    flag[i] = true;
                    break;
                }
            }
        }
        return flag[s.length()];
    }
}
