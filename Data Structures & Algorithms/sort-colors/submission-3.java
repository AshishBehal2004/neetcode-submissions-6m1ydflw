class Solution {
    public void sortColors(int[] nums) {
        int l_pointer = 0;
        int r_pointer = nums.length-1;
        int i = 0;

        while(i <= r_pointer){
            if(nums[i] == 0){
                int temp = nums[l_pointer];
                nums[l_pointer] = nums[i];
                nums[i] = temp;
                l_pointer++;
            }
            else if(nums[i] == 2){
                int temp = nums[r_pointer];
                nums[r_pointer] = nums[i];
                nums[i] = temp;

                r_pointer--;
                i--; 
            }
            i++;
        }

    }
     
}