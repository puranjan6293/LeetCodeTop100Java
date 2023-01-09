package TOP_QUESTIONS.SlidingWindow;

import java.util.HashMap;

public class Longest_SubString_without_Repeatating_Characters {
    public int lengthOfLongestSubstring(String s) {
        //Approach: Using HashMap and Sliding Window T.C: O(n)
        //Map to store the last index at which each character was seen
        HashMap<Character, Integer> map = new HashMap<>();
        // The length of the longest substring without repeating characters
        int maxLength = 0;
        // The starting index (left) of the current substring
        int left = 0;
        // Iterate through each character in the string
        for(int right = 0;right<s.length();right++){
            char c = s.charAt(right);
             // If the character has been seen before, update the start index
             // to be the maximum of the current start index and the index of
             // the character + 1
             if(map.containsKey(c)){
                 left = Math.max(left, map.get(c)+1);
             }
             // Update the max length if necessary
             maxLength = Math.max(maxLength, right-left+1);
             // Store the index of the character in the map
             map.put(c, right);
        }
        //return the maxLength
        return maxLength;
    }
}
