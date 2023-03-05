package TOP_QUESTIONS.LikedQuestions;
import java.util.*;
public class Latter_Combinations_Of_Phone_Number {
    public List<String> letterCombinations(String digits) {
        //Approach: Using HashMap and Backtracking
        //Time complexity: O(x^m * y^n), Space complexxity: O(n)
        //add key and values to the map
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        //ans arrayList
        List<String> ans = new ArrayList<>();
        //base case
        if(digits.length()==0) return ans;

        //make a new string builder
        StringBuilder sb = new StringBuilder();

        //call backtrack recursion
        backtracking(sb, digits, ans, map, 0);
        return ans;

    }
    //method for backtracking
    public void backtracking(StringBuilder sb, String digits, List<String> ans, HashMap<Character, String> map, int start){
        //base case
        if(sb.length()==digits.length()){
            //add values to the ans arrayList
            ans.add(sb.toString());
            return;
        }
        //traverse through the digits
        for(int i=start;i<digits.length();i++){
            //get the digits corresponding string
            String cs = map.get(digits.charAt(i));

            //iterate through the corresponding string, which we got from map
            for(int j = 0;j<cs.length();j++){
                //add element to stringBuilder
                sb.append(cs.charAt(j));
                //call recursion
                backtracking(sb, digits, ans, map, i+1);
                //delete the element from the StringBuilder
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}
