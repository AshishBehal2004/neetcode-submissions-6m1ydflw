class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int [n * 2];
        int idx_tracker = 0;

        for (int i = 0; i < n; i++){
            idx_tracker = i;
            ans[i] = nums[i];
        }
        idx_tracker++;
        int i = 0;

        for(int j = idx_tracker ; j < ans.length; j++){
            ans[j] = nums[i];
            i++;   
        }
        return ans;
    }
}