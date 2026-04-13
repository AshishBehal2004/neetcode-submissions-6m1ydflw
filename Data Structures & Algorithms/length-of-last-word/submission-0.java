class Solution {
    public int lengthOfLastWord(String s) {
        String[] word = s.split(" ");

        int lastWord = word[word.length -1].length();

        return lastWord;
    }
}