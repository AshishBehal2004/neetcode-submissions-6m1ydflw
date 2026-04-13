class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int result = 0;
        for(int i = 0; i < heights.length;i++){
            for(int j = i+1; j < heights.length;j++){
                area = (j-i)  * Math.min(heights[i], heights[j]);
                result = Math.max(result, area);
            }
        }
        return result;
    }
}
