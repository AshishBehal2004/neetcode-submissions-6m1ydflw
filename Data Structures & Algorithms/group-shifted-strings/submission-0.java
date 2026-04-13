class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        
        HashMap<String, List<String>> result = new HashMap<>();

        for(String s : strings){
            String hashKey = getHash(s);
            if(result.get(hashKey) == null){
                result.put(hashKey, new ArrayList<>());
            }
            result.get(hashKey).add(s);
        }
        return new ArrayList<>(result.values());
    
    }

    // i need to convert each string to hash
    public String getHash(String s){

        char[] ch = s.toCharArray();
        StringBuilder hashkey = new StringBuilder();

        for (int i = 1; i < ch.length;i++){
            hashkey.append((char) ((ch[i] - ch[i-1] + 26)%26) );
        }

        return hashkey.toString();
    }
}
