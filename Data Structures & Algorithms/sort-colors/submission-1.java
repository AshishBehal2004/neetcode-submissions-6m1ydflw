class Solution {
    public void sortColors(int[] nums) {
        int start= 0;
        int end = nums.length-1;

        quicksort(nums, start, end);
    }

    public void quicksort(int[] nums, int start, int end ){
        if (start >= end){
            return;
        }
        int pivot = partition(nums, start, end);
        quicksort(nums, start, pivot-1); // sort the first half of nums
        quicksort(nums, pivot+1, end);// sort the remaining/second half of nums

    }

    public int partition(int[] nums, int start, int end){
        int index = start - 1; //boundary check 
        int pivot = nums[end];
        for(int i = start; i < end; i++){
            if (nums[i] <= pivot){
                index++;
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
        }
        index++;
        int temp = nums[end];
        nums[end] = nums[index];
        nums[index] = temp;
        return index;
    }
}