import java.util.HashSet;
import java.util.Scanner;

public class Longest_SubString_without_Repeatating_Characters {
    public static int lengthOfLongestSubstring(String s) {
        //Approach: Using Sliding Window & HashSet
        //initialize the required variables
        int left = 0;
        int ans = 0;
        //initialize the HashSet
        HashSet<Character> set = new HashSet<>();
        //traverse through the string
        for(int right = 0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                //remove the left value and increment one window
                set.remove(s.charAt(left));
                left++;
            }
            //add the current or called right value to the set
            set.add(s.charAt(right));
            //length of the substring will be:
            //       rightPointer-leftPointer+1
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.next();
        System.out.println("the length of the longest substring without rpc is: "+ lengthOfLongestSubstring(s));
    }
}
