class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for(int i = 0; i < s.length(); i++){
            if ( map.containsKey(s.charAt(i))){ //openning bracket check
                stack.push(s.charAt(i));
            } 
            else if(map.containsValue(s.charAt(i)) ){ // closing bracket check
                if (!stack.empty() && map.get(stack.peek()) == s.charAt(i)){
                    stack.pop();
                }
                else return false;
            }
            else{
                return false;
            }
        }
        if (stack.empty()){
            return true;
        }
        else return false;

    }
}
