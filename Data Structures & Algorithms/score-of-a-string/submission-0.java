class Solution {
    public int scoreOfString(String s) {
        int score = 0;

        for(int i = 1; i < s.length();i++){
            int pointer1 = s.charAt(i) - 0;
            int pointer2 = s.charAt(i-1) - 0;
            int subtract = pointer1 - pointer2;
            score += Math.abs(subtract);
        }
        return score;
    }
}