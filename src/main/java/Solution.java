public class Solution {
    public int lengthOfLastWord(String s) {
        //create a pointer to find the last letter of the last word
        int pointer = s.length() - 1;
        while (!Character.isLetter((s.charAt(pointer)))) {
            pointer--;
        }
        //create a pointer to find the first letter of the first word
        int start = pointer;
        while (start >= 0 && Character.isLetter((s.charAt(start)))) {
            start--;
        }
        //return the length of the last word
        return pointer - start;
    }
}
