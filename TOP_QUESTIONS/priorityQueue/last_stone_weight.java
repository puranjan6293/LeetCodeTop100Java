package TOP_QUESTIONS.priorityQueue;
import java.util.*;
public class last_stone_weight {
    public int lastStoneWeight(int[] stones) {
        //Approach: Using a PriorityQueue

        //initialize a priorityqueue
        PriorityQueue<Integer> maxheap = new PriorityQueue<>();

        //add all the elements into it
        // -stone: because we have to stay attention for the negavive result
        for(int stone:stones){
            maxheap.add(-stone);
        }

        //now traverse through the heap while its size is >1
        while(maxheap.size()>1){
            //remove two elements
            int stone1 = maxheap.remove();
            int stone2 = maxheap.remove();

            //if they not same, than we need to add the difference in our heap again
            if(stone1!=stone2){
                maxheap.add(stone1-stone2);
            }
        }
        return maxheap.size()!=0 ? (-maxheap.remove()) : 0;
    }
}
