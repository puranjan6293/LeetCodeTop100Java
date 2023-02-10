package TOP_QUESTIONS.Queue;
import java.util.*;
public class Number_of_students_unable_to_eatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        /*
        //Approach1, Using TwoPointer, T.C: O(n), S.C: O(1)
        int zeros = 0;
        int ones = 0;

        //students intrest
        for(int st : students){
            if(st==0){
                zeros++;
            }
            else ones++;
        }

        //sandwiches intrest
        for(int sand : sandwiches){
            if(sand == 0){
                if(zeros == 0){
                    return ones;
                }
                zeros--;
            }
            else{
                if(ones==0){
                    return zeros;
                }
                ones--;
            }
        }
        return 0;
        */

        //Approach2, using Queue and Stack, T.C: O(n^2), S.C: O(n)
        //initialize Queue and Stack
        Queue<Integer> line = new LinkedList<>();
        Stack<Integer> menu = new Stack<>();

        //add to queue
        for(int e : students){
            line.offer(e);
        }
        //add to stack
        for(int i=sandwiches.length-1;i>=0;i--){
            menu.push(sandwiches[i]);
        }

        //initialize count variable
        int count = line.size()*menu.size(); //maximum possible combo

        //while loop for checking
        while(count-->0){
            //if the student has got the sandwitch he wants 
            if(!menu.isEmpty() && menu.peek()==line.peek()){
                //remove elements
                line.poll();
                menu.pop();
            }
            else{
                //if the student has not got the sandwitch he wants
                if(line.size()>0){
                    //remove and add to the end
                    line.offer(line.remove());
                }
                else return 0;
            }
        }
        return line.size();
    }
}
