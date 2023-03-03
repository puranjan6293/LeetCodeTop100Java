package TOP_QUESTIONS.LikedQuestions;

import java.util.Arrays;

public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        //Approach1: Using Two Pointer Algorithm

        //base case
        if(strs==null || strs.length==0) return "";

        //sort the array
        Arrays.sort(strs);

        int c = 0;
        int len = strs.length;

        //divide as substrings
        String first = strs[0];
        String last = strs[len-1];
        //Iterate
        while(c<first.length()){
            //condition: if first and last string, characters are same
            if(first.charAt(c)==last.charAt(c)){
                c++;
            }
            else break;
        }
        if(c==0) return "";
        else return first.substring(0, c);

        /*
        //Approach2: Using inde of function

        //take the first index as a new string
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
        */
    }
}
