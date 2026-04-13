class Solution {
    public boolean hasDuplicate(int[] nums) {
        // for(int i = 0 ; i < nums.length;i++){

        //     int duplicate = nums[i];
        //     for (int j = i+1; j < nums.length;j++){
        //         if(nums[j] == duplicate){
        //             return true;
        //         }
        //     }
        // }  
        // return false; 

        HashSet <Integer> hSet = new HashSet<>();
        for (int i = 0; i < nums.length;i++){
            if (hSet.contains(nums[i])){
                return true;
            }
            hSet.add(nums[i]);
        }
        return false;


    }
}