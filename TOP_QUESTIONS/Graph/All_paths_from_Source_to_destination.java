package TOP_QUESTIONS.Graph;
import java.util.*;
public class All_paths_from_Source_to_destination {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        //Approach, Using DFS
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        //initialize a current list
        List<Integer> curr = new ArrayList<>();
        //add a value to the current
        curr.add(0);
        //call dfs
        dfs(ans, curr, graph, 0, graph.length-1);
        return ans;

    }
    //dfs method
    private void dfs(List<List<Integer>> ans, List<Integer> curr, int[][] graph, int src, int dest){
        //base case
        if(src==dest){
            ans.add(new ArrayList<>(curr));
            return;
        }
        //traverse and check
        for(int n : graph[src]){
            //add values to cuu list
            curr.add(n);
            //call dfs, note: n will be the next src
            dfs(ans, curr, graph, n, dest);
            //remove from curr list
            curr.remove(curr.size()-1);
        }
    }
}
