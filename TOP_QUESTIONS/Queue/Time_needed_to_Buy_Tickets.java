package TOP_QUESTIONS.Queue;

import java.util.*;

public class Time_needed_to_Buy_Tickets {
    public int timeRequiredToBuy(int[] tickets, int k) {
        /*
        //Approach1, Using Logic, T.C: O(n^2), S.C: O(1)
        int ans = 0;
        while(tickets[k]>0){
            int count = 0;
            for(int i=0;i<tickets.length;i++){
                if(tickets[i]>0 && tickets[k]!=0){
                    tickets[i]-=1;
                    count+=1;
                }
            }
            ans = ans+count;
        }
        return ans;
        */

        //Approach2, Using Queue
        //initialize a Queue
        Queue<Integer> q = new LinkedList<>();
        //add values to the Queue
        for(int i=0;i<tickets.length;i++){
            q.add(i);
        }

        //initilize the count variable
        int count = 0;
        while(!q.isEmpty()){
            //increment count 
            ++count;
            //remove the front variable from queue and check
            int front = q.poll();
            //if tickets[front] is greater than or equal to 1 than do
            //tickets[front]-=1
            if(tickets[front]>=1){
                tickets[front]-=1;
            }
            //if the k is the first index then break
            if(k==front && tickets[front]==0){
                break;
            }
            //if the k is not the first index then leave the first index 
            //and move forward
            if(k!=front && tickets[front]==0){
                continue;
            }
            //add the removed value in the queue
            q.add(front);
        }
        return count;
    }
}
