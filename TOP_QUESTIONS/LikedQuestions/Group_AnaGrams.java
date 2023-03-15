package TOP_QUESTIONS.LikedQuestions;
import java.util.*;
public class Group_AnaGrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Approach: Using HashMap
        HashMap<String, List<String>> map = new HashMap<>();

        //traverse
        for(int i=0;i<strs.length;i++){
            //index
            String si = strs[i];
            char[] arr = si.toCharArray();
            Arrays.sort(arr);

            String sn = new String(arr);
            //if map haven't sn than add
            if(!map.containsKey(sn)){
                map.put(sn, new ArrayList<>());
            }
            map.get(sn).add(si);
        }
        //return the map values as new arrayList
        return new ArrayList<>(map.values());
    }
}
