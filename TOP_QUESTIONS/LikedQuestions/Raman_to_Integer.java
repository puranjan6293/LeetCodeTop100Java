package TOP_QUESTIONS.LikedQuestions;

import java.util.HashMap;

public class Raman_to_Integer {
    public int romanToInt(String s) {
        //Approach: Using HashMap
        //Base case
        if(s==null || s.length()==0) return -1;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int len = s.length();
        //initially take the last index as the value
        int ans = map.get(s.charAt(len-1));

        //traverse reversely from len-2
        for(int i=len-2;i>=0;i--){
            //case1
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))){
                ans += map.get(s.charAt(i));
            }
            else{
                ans -= map.get(s.charAt(i));
            }
        }
        return ans;
    }
}
