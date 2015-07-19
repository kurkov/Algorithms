/*
https://leetcode.com/problems/length-of-last-word/

Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example,
Given s = "Hello World",
return 5.
*/


package leetcode.length_of_last_word;

public class Solution {

    public int lengthOfLastWord(String s) {

        if ("".equals(s)) {
            return 0;
        } else {
            String[] stringArray = s.split(" ");

            if (stringArray.length == 0) {
                return 0;
            } else {
                int arraySize = stringArray.length;
                String lastWord = stringArray[arraySize - 1];

                return lastWord.length();
            }
        }
    }
}
