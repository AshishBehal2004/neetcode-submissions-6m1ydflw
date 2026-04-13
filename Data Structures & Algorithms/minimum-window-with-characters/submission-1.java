class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()){
            return "";
        }

        HashMap<Character, Integer> countT = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for(int i = 0; i < t.length();i++){
            char c = t.charAt(i);
            countT.put(c, countT.getOrDefault(c, 0)+ 1);
        }

        int left = 0;
        int have = 0;
        int need = countT.size();
        int resL =0;
        int resR = 0;
        int resLen = Integer.MAX_VALUE;
        for (int r = 0; r < s.length();r++){
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (countT.containsKey(c) && countT.get(c) == window.get(c)){
                have++;
            }
            while (have == need){
                if ((r-left+1) < resLen ){
                    resLen = r-left+ 1;
                    resL = left;
                    resR = r;
                }
                c = s.charAt(left);
                window.put(c, window.getOrDefault(c, 0) - 1);
                if (countT.containsKey(c) && window.get(c) < countT.get(c)){
                    have--;
                }
                left++;
            }
        }
        if (resLen == Integer.MAX_VALUE){
            return "";
        }
        else{
            return s.substring(resL, resR+1);
        }

        
    }
}
