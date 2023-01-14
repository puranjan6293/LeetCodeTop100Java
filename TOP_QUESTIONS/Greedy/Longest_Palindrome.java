package TOP_QUESTIONS.Greedy;

public class Longest_Palindrome {
    public int longestPalindrome(String s) {
        /*
        //Apprach 1: Using HashSet
        //Edgecase: if string is null or String length is 0
        if(s==null || s.length()==0) return 0;
        //initialize the count value 
        int count = 0;
        //make a hashSet for finding duplicates
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(hs.contains(s.charAt(i))){
                //if hashSet haves the current element i, remove that element
                hs.remove(s.charAt(i));
                //increment the count by 1
                count++;
            }
            //if the HashSet doesn't contain the current element i, add it.
            else{
                hs.add(s.charAt(i));
            }
        }
        //if the last current element remain in the hashset, we have add that in count
        if(!hs.isEmpty()) return count*2+1;
        //else return the count , *2 means we once added and removed e,i: 2 times
        return count*2;
        */
        //Approach 2: Using Greedy Algorithm, T.C: o(n)
        // Create an array to store the count of each character
        int[] count = new int[128];
        int ans = 0;
        // Iterate through the characters of the input string
        for (char c : s.toCharArray()) {
            // Increment the count of the current character
            count[c]++;
            // If the count of the current character is even
            if (count[c] % 2 == 0) {
                // Add 2 to the answer, since we can use these characters for the palindrome
                ans += 2;
            }
        }
        // If the answer is less than the length of the input string
        if (ans < s.length()) {
            // Add 1 to the answer, since we can use an odd number of characters to make a palindrome
            ans++;
        }
        // Return the answer
        return ans;
    }
}
