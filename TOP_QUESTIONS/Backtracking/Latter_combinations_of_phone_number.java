package TOP_QUESTIONS.Backtracking;
import java.util.*;
public class Latter_combinations_of_phone_number {
    public List<String> letterCombinations(String digits) {
        // build up the HashMap Charater to String
        Map<Character, String> phone = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
          }};
        List<String> ls = new ArrayList<>();
        // if "digits" is empty return empty list
        if(digits.length() == 0) {
            return ls;
        }
        StringBuilder sb = new StringBuilder();
        backtrack(sb, digits, ls, phone, 0);
        return ls;
    }
    
    public void backtrack(StringBuilder sb, String digits, List<String> ls, Map<Character, String> phone, int start) {
        if(sb.length() == digits.length()) {
            ls.add(sb.toString());
            return;
        }
        // we have to use 'start' to ensure we will go to next character of digit
        for(int i = start; i < digits.length(); i++) {
            // get the character's corresponding String from the map
            String s = phone.get(digits.charAt(i));
            // loop through all the character in specific String in Map
            for(int j = 0; j < s.length(); j++) {
                sb.append(s.charAt(j));
                backtrack(sb, digits, ls, phone, i + 1);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
