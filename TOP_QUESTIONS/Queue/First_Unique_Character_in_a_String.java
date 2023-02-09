package TOP_QUESTIONS.Queue;

import java.util.*;

public class First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {
        /*
        //Approach1, Using HashMap, T.C: O(n), S.C: O(n)
        HashMap<Character, Integer> map = new HashMap<>();
        //store character with frequency
        for(int i=0;i<s.length();i++){
            // ->here we store the character as key and the character
            // frequency as value
            //  -> if character dont have frequency then just put 0
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
        */

        //Approach2, Using Queue
        //initialize a Queue
        Queue<Character> q = new LinkedList<>();
        int len = s.length();
        char temp = 0;
        for(int i=0;i<s.length();i++){
            q.offer(s.charAt(i));
        }

        //remove and check
        while(len>0){
            temp = q.poll();
            if(!q.contains(temp)){
                return s.indexOf(temp);
            }
            else{
                q.offer(temp);
            }
            len--;
        }
        return -1;
    }
}
