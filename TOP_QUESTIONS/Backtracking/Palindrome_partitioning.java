package TOP_QUESTIONS.Backtracking;
import java.util.*;
public class Palindrome_partitioning {
    public List<List<String>> partition(String s) {
        //Approach: Using Backtracking approach
        //we have to check if a sunstring is palindrome
        List<List<String>> ans = new ArrayList<>();
        backtrack(ans, s, new ArrayList<>());
        return ans;
    }
    //Backtrack method
    public void backtrack(List<List<String>> ans, String s, ArrayList<String> temp){
        //base case
        if(s==null || s.length()==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        //iterate through the string, here i=1 because we are going to use substring method
        for(int i=1;i<=s.length();i++){
            //take a substring
            String tempString = s.substring(0,i);
            //check, is the substring is palindrome or not, if not continue
            if(!isPalindrome(tempString)){
                continue;
            }

            //regular back track things
            //add to temp arraylist
            temp.add(tempString);
            //call backtrack,
            //remember: calling backtrack for rest part of the string
            //the rest part of the string is starting from the index i
            backtrack(ans, s.substring(i, s.length()), temp);
            //remove from temp arrayList
            temp.remove(temp.size()-1);
        }
        return;

    }
    //Palindrome method using BinarySearch
    public boolean isPalindrome(String temp){
        int left = 0, right = temp.length()-1;

        //traverse
        while(left<=right){
            if(temp.charAt(left)!=temp.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
