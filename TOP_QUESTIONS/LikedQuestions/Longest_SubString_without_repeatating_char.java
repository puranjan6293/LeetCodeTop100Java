package TOP_QUESTIONS.LikedQuestions;

import java.util.HashMap;

public class Longest_SubString_without_repeatating_char {
    public int lengthOfLongestSubstring(String s) {
        //Approach: Using HashMap
        //Idea: find maxLength and every time update it

        int maxLen = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        //traverse through the map
        for(int right = 0;right<s.length();right++){
            //if the s.charAt(right) is present int the map
            if(map.containsKey(s.charAt(right))){
                //update the left pointer
                /*here map.get(c)+1 because map.get(c)+1 index will be
                 our next left pointer */
                left = Math.max(left, map.get(s.charAt(right))+1);
            }
            //if there will be other max length exist then update it
            maxLen = Math.max(maxLen, right-left+1);

            //if s.charAt(right) is not present in the map than put it
            map.put(s.charAt(right), right);
        }
        return maxLen;
    }
}
