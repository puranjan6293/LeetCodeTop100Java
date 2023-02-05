package TOP_QUESTIONS.HashTable;

import java.util.HashMap;

public class Longest_SubString_Without_Repetating_characters {
    public int lengthOfLongestSubstring(String s) {
        //Approach using hashmap and SlidingWindow
        //initialize the left pointer
        int left = 0;
        //initialize the maxLingth variables
        int maxLength = 0;

        //initilize the hashmap
        HashMap<Character, Integer> map = new HashMap<>();

        //Traverse through the String
        for(int right = 0;right<s.length();right++){
            //for clean code
            char c = s.charAt(right);

            //if the character is present in the map
            if(map.containsKey(c)){
                //update the left pointer
                /*here map.get(c)+1 because map.get(c)+1 index will be
                 our next left pointer */
                left = Math.max(left, map.get(c)+1);
            }
            //if there will be othe max length exist, update it
            maxLength = Math.max(maxLength, right-left+1);

            //if there c is not present in the map then put it
            map.put(c, right);
        }
        return maxLength;
    }
}
