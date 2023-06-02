package TOP_QUESTIONS.priorityQueue;
import java.util.*;
public class kth_largest_element_in_an_array {
    public int findKthLargest(int[] nums, int k) {
        //initialize a min heap
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int n:nums){
            //first add the element to the heap
            heap.add(n);
            //if size of the heap is greater than k
            if(heap.size()>k){
                //remove the root element (lowest of all)
                heap.poll();
            }
        }
        //finally heap has k largest elements left with root as the kth largest element
        return heap.peek();
    }import java.util.*;import java.util.*;
}
