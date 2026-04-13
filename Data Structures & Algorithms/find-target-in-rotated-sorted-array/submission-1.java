class Solution {
    public int search(int[] nums, int target) {
        
        int res = 0;
        int l = 0;
        int r = nums.length-1;

        while( l <=r){
            int m = (l+r) / 2;
            if (target == nums[m]){
                return m;
            }
            if (nums[l] <= nums[m] ){ // checking that are we in left half sorted half
                if (target > nums[m] || target < nums[l]){
                    l = m + 1;
                }
                else {
                    r = m - 1;
                }
            }
            else{ // checking that are we in right sorted half
                if (target < nums[m] || target > nums[r]){
                    r = m - 1;
                }
                else {
                    l = m + 1;
                }
            }
        }
        return -1;
    }
}
