package TOP_QUESTIONS.LikedQuestions;
import java.util.*;
public class Top_K_frequent_Element {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        //count the frequencies
        for(int n:nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        //make a new ArrayList
        List<Map.Entry<Integer, Integer>> eList = new ArrayList<>(map.entrySet());

        //sort the frequency in decending order
        eList.sort((a,b)->b.getValue()-a.getValue());

        //now add to the ans array
        for(int i=0;i<k;i++){
            ans[i] = eList.get(i).getKey();
        }
        return ans;
    }
}
