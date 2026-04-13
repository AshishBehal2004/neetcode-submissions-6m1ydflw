class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int [n * 2];
        int idx_tracker = 0;
        // HashMap<Integer, Integer> copy_map = new HashMap<>();

        for (int i = 0; i < n; i++){
            idx_tracker = i;
            ans[i] = nums[i];
            // copy_map.put(i,nums[i]);
        }

        idx_tracker++;
        int val = 0;  
        int i = 0;
        for(int j = idx_tracker ; j < ans.length; j++){
             
            ans[j] = nums[i];
            i++;
            
        }

        // System.out.println(Arrays.toString(ans));

        return ans;


    }
}