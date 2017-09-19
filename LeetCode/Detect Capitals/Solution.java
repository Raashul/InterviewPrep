/*

Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital if it has more than one letter, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.



*/

public class Solution {
	
    public boolean detectCapitalUse(String word) {
        int capitals = 0;
        int nonCapitals = 0;
        int others = 0;
        
        for(char c: word.toCharArray()){
            if(c >='A' && c <='Z'){
                capitals++;
            }
            else if(c >='a' && c <='z'){
                nonCapitals++;
            }
            else{
                others++;
            }
        }
        
        if(others > 0){
            return false;
        }
        
        if(word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'  && nonCapitals == word.length()-1){
            return true;
        }
        
        if(capitals == word.length() || nonCapitals == word.length()){
            return true;
        }
        return false;
        
    }
}