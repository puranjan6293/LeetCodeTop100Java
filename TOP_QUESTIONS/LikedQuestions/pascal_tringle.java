package TOP_QUESTIONS.LikedQuestions;
import java.util.*;

public class pascal_tringle {
    public List<List<Integer>> generate(int numRows) {
        //general Approach, T.C: O(n^2), S.C: O(n^2)
        //n is the numRows
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> level = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            level.add(0, 1);
            for(int j=1;j<level.size()-1;j++){
                level.set(j, level.get(j)+level.get(j+1));
            }
            ans.add(new ArrayList<>(level));
        }
        return ans;
    }
}
