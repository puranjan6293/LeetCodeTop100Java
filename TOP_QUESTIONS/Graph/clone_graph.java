package TOP_QUESTIONS.Graph;

public class clone_graph {
    //create a global HashMap, it helps to decrease the tc and sc
    public HashMap<Integer, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        //Approach: Using HashMap and DFS algo
        //Time and Space Complexity of this splution is O(V+E)
        //V: Vertises, E: Edges
        //base case
        if(node==null) return null;
        //if map contains the node, means we already cloned the node
        //so just returned the cloned val
        if(map.containsKey(node.val)){
            return map.get(node.val);
        }

        //make a copy of that node
        Node copyNode = new Node(node.val, new ArrayList<Node>());
        //put the copyNode in the map
        map.put(node.val, copyNode);
        //now call dfs recursion for all the node's neighbors
        for(Node neighbor:node.neighbors){
            copyNode.neighbors.add(cloneGraph(neighbor));
        }

        //return the copynode
        return copyNode;
    }
}
