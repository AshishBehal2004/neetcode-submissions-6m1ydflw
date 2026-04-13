class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        String result = "";
        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for(char c :  order.toCharArray()){
            if (map.containsKey(c)){
                result += String.valueOf(c).repeat(Math.max(0,map.get(c)));
                map.remove(c);
            }
        }

        for(char c : map.keySet()){
            result += String.valueOf(c).repeat(Math.max(0,map.get(c)));

        }
        return result;
    }
}