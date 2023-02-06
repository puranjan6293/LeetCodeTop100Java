package TOP_QUESTIONS.Sorting;

public class First_Missing_Positive {
    public int firstMissingPositive(int[] nums) {
        /*
        //Approach1, Using Sorting, T.C: O(nlogn), S.C: O(1)
        Arrays.sort(nums);
        int lastSeen = 1;
        for(int i=0;i<nums.length;i++){
            //ignore the negative
            //and ignore the positives but duplicates
            if(nums[i]<=0 || (i>0 && nums[i]==nums[i-1])){
                continue;
            }
            //if the current nums[i] is same or equal to lastseen
            //then increment the lastseen

             if(nums[i]==lastSeen){
                 lastSeen++;
             }
             else break;
        }
        return lastSeen;
        */

        /*
        //Approach2, Using HashSet, T.C: O(n), S.C: O(n)
        HashSet<Integer> s = new HashSet<>();
        int max = Integer.MIN_VALUE;
        //add value to the Set
        for(int e:nums){
            s.add(e);
            //find which value is the maximum
            max = Math.max(max, e);
        }

        //Required base case, if our max is negative
        if(max<1) return 1;

        //iterate from 1
        for(int i=1;i<max;i++){
            //if HashSet not contain i, ten i is the ans
            if(!s.contains(i)){
                return i;
            }
        }
        //if set contains i, that means our ans will be max+1;
        return max+1;
        */

        //Lets try more optimization
        //Approach3, Using QuickSort, T.C: O(n), S.C: O(1)
        int n = nums.length;
        //sort the array
        for(int i=0;i<n;i++){
            //sort the duplicates and negatives
            while(nums[i]>0 && nums[i]<=n && nums[nums[i]-1]!=nums[i]){
                //swap tp sort
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
        }
        //Lets find which value is missing 
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        //if i=1 is not the answer than obeously n+1 will be the answer
        return n+1;
    }
}
