package TOP_QUESTIONS.SlidingWindow;

public class Permutation_inString {
    public boolean checkInclusion(String s1, String s2) {
        //Intitialize the length of the strings
        int l1 = s1.length();
        int l2 = s2.length();
        //return false if s1 is longer than s2
        if(l1>l2) return false;
        
        //initialize the count array with the counts of the characters in s1
        int[] count = new int[26];
        for(int i=0;i<l1;i++){
            count[s1.charAt(i)-'a']++;
        }
        // Initialize variables to track the number of characters that have not been matched
        int unmatched = l1;
        int left = 0;

         // Iterate through s2, updating the count array and the unmatched count as we go along
         for(int right=0;right<l2;right++){
            // Decrement the count for the character at the right pointer
            if (--count[s2.charAt(right) - 'a'] >= 0) {
                // If the count is non-negative, it means that the character at the right pointer is present in s1 and has not been matched yet, so we decrement the unmatched count
                unmatched--;
            }
            //if all characters of s1 has been matched return true
            if(unmatched==0) return true;
            // If the window size is equal to the length of s1, we need to move the left pointer and update the count array and unmatched count
            if(right-left+1==l1){
                // Increment the count for the character at the left pointer
                if (++count[s2.charAt(left++) - 'a'] > 0) {
                    // If the count is now positive, it means that the character at the left pointer was present in s1 and has been matched, so we increment the unmatched count
                    unmatched++;
                }
            }
         }
         // If none of the windows of s2 contained a permutation of s1, return false
         return false;
    }
}
