class Solution {

    public String encode(List<String> strs) {
        String result = "";

        for(int i = 0; i < strs.size();i++){
            String s = strs.get(i);
            result +=  Integer.toString(s.length()) +  "#" + s;
        }
        return result;
    }

    public List<String> decode(String str) {
        int i = 0;
        ArrayList<String> result = new ArrayList<>();

        while( i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            result.add(str.substring(j+1, j+1+length) );
            i = j + 1 + length;
            
        }
        return result;
    }
}
