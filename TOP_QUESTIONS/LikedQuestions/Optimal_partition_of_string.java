package TOP_QUESTIONS.LikedQuestions;

import java.util.HashMap;

public class Optimal_partition_of_string {
    public int partitionString(String s) {
        //Approach: Using HashMap, T.C: O(n), S.C: O(k)

        int idx = 0;
        int count = 0;
        //map for track the last occurrence of each character
        HashMap<Character, Boolean> map = new HashMap<>();

        //traverse through the string
        while(idx<s.length()){
            // if current character has already appeared in current substring
            if(map.containsKey(s.charAt(idx))){
                count++;

                //now clear the map
                map.clear();
            }
            //add to the map
            map.put(s.charAt(idx), true);
            idx++;
        }
        //here +1 because we have to consider the last substring aswell
        return count+1;
    }
}
