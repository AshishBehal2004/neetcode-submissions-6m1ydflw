class Solution {
    public int[] sortArray(int[] nums) {
        
        mergeSort(nums, 0, nums.length-1);
        return nums;

    }

    public void mergeSort(int[] nums, int start, int end){
    
        int middle = (start + end) / 2;

        if (start >= end){
            return ;
        }
        mergeSort(nums,start, middle);
        mergeSort(nums,middle+1,end);
        merge(nums, start, middle, end);
        
        
    }

    public void merge(int[] nums, int startIndex,int middle, int endIndex){
        
        ArrayList<Integer> temp = new ArrayList<>();

        
        int index = 0;
        int i  = startIndex;
        int j = middle+1;
        while(i <= middle && j <= endIndex)
        {
            if (nums[i] < nums[j]){
                 temp.add(nums[i]);
                 i++;
            }
            else {
                temp.add(nums[j]);
                j++;
            }
        }
        

        while(i <= middle){
            temp.add(nums[i]);
            i++;
        }

        while(j < endIndex) {
            temp.add(nums[j]);
            j++;
        }
        for(int k = 0; k < temp.size();k++){
            nums[startIndex + k] = temp.get(k);
        }

    }
}