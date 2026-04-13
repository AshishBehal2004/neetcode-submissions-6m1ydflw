class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] res = new int [2];
        int i = 0;
        int j = 0;
        while(i < nums.length){
            for(int k = i+1; k < nums.length;k++ ){
                if (nums[k] + nums[i] == target){
                    res[0] = i;
                    res[1] = k;
                    return res;
                }
            }
            i++;
        }
        return res;
    }
}