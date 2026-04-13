class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        quicksort(start, end, nums);
    }

    public void quicksort(int start, int end, int[] nums){
        
        if (start >= end){
            return;
        }

        int pivot = partition(start, end, nums);
       
        quicksort(start,pivot-1, nums);
        quicksort(pivot+1, end, nums);

    }
    public int partition(int start, int end, int[] nums){
        int i = start;
        int j = end;
        int pivot = nums[end];

        int index = start -1;

        for(int a = start; a < end;a++){
            if (nums[a] <= pivot){
                index++;
                int temp = nums[index];
                nums[index] = nums[a];
                nums[a] = temp;
            }
        }
        index++;
        int temp = nums[index];
        nums[index] = nums[end];
        nums[end] = temp;

        return index;
    }
}