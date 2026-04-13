class Solution {
    public int firstMissingPositive(int[] nums) {
        int missing = 1;
        while(true){
            boolean flag = true;
            for(int val : nums){
                if (val == missing){
                    flag = false;
                    break;
                }
            }
            if (flag){
                return missing;
            }
            missing++;
        }
        
    }
}