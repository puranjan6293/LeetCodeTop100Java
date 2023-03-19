package TOP_QUESTIONS.LikedQuestions;

public class Climb_Stairs {
    public int climbStairs(int n) {
        /*
        //Approach1: Using Recursion, TLE
        //base cases
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;

        //for rest cases call the recursion
        return climbStairs(n-1)+climbStairs(n-2);
        */

        //Approach2: Using DP Buttom UP Approach, T.C: O(n), S.C: O(1)
        //case1: if n is lessthan equal to 1
        if(n<=1) return 1;

        int prev1 = 1;
        int prev2 = 2;
        //iterate from 3
        for(int i=3;i<=n;i++){
            int sum = prev1+prev2;

            prev1 = prev2;
            prev2 = sum;
        }

        // now return prev2, that is the second value
        return prev2;

    }
}
