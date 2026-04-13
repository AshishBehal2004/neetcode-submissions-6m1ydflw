class Solution {
    public boolean isPalindrome(String s) {
        String left = "";
        String right = "";
        int l = 0;
        int r = 0;
        int i = 0;
        l = i;
        r = s.length()-1;
        
        while (l < r){
            
            if (!Character.isLetterOrDigit(s.charAt(l))){
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(r))){
                r--;
                continue;
            }
            left = Character.toString(s.charAt(l));
            right = Character.toString(s.charAt(r));

            
            if (!left.equalsIgnoreCase(right)){
               return false; 
            }
            l++;
            r--;
            i++;
        }
        return true;
    }
}
