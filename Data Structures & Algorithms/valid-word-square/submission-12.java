class Solution {
    public boolean validWordSquare(List<String> words) {
        for(int r = 0; r < words.size(); r++){
            String row = words.get(r);

            for (int c = 0; c < row.length();c++){
                if (c >= words.size()){
                    return false;
                }
                if (r >= words.get(c).length()){
                    return false;
                }

                if (row.charAt(c) != words.get(c).charAt(r)){
                    return false;
                }
            }
        }
        return true;
    }
}
