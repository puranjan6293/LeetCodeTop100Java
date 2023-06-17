import java.util.HashMap;
import java.util.Scanner;

public class LongestRepetativeCharacterReplacement {
    public static int characterReplacement(String s, int k) {
        //Approach: Using Sliding Window and a HashMap
        //Idea: count frequencies
        //      for replacement we first check, if right-left+1-maxCount>k
        int left = 0;
        int maxLength = 0;
        int maxCount = 0;
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        //traverse through the string
        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);
            //Frequncy count
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);
            maxCount = Math.max(maxCount, frequencyMap.get(c));

            //logic for replacement
            if(right-left+1 - maxCount>k){
                char leftChar = s.charAt(left);
                // -1 because, we need to decrement the frequency of the element by 1
                frequencyMap.put(leftChar, frequencyMap.get(leftChar)-1);
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the replacemnt value k: ");
        int k = sc.nextInt();
        System.out.println("Enter the string s: ");
        String s = sc.next();
        System.out.println("Longest repeatating character is: "+ characterReplacement(s, k));
    }
}
