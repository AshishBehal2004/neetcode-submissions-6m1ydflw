class Solution {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0;i < nums.length;i++){
            if (nums[i] < 0){
                nums[i] = 0;
            }
        }

        for (int j = 0; j < nums.length;j++){
            int val = Math.abs(nums[j]);

            if (1 <= val && val <= nums.length){

                if (nums[val - 1] > 0){
                    nums[val - 1] *= -1;
                }
                else if(nums[val - 1] == 0){
                    nums[val - 1] = -1 * (nums.length + 1);
                }
            }
        }
        for(int k = 1; k < nums.length+1;k++){
            if (nums[k - 1] >= 0 ){
                return k;
            }
        }
        return nums.length + 1;
    }
}