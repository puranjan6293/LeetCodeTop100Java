package TOP_QUESTIONS.LikedQuestions;

public class Longest_palindromic_Substring {
    public String longestPalindrome(String s) {
        //Approach: Using Expand Around Center
        String str = "";
        
        //if the given string is empty
        if(s.length()<1) return "";

        //iterate through the elements
        for(int i=0;i<s.length();i++){
            String s1 = helper(s, i, i);
            String s2 = helper(s, i, i+1);

            //check the sizes and store which is bigger
            if(s1.length()>str.length()){
                str = s1;
            }
            if(s2.length()>str.length()){
                str = s2;
            }
        }
        return str;
    }
    public String helper(String s, int left, int right){
        //check the substring for check around the center method
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        //the substring will be from left+1, to right
        return s.substring(left+1, right);
    }
}
