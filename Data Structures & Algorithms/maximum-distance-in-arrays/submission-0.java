class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int n = arrays.get(0).size(); // length of first list in array
        int curr_min = arrays.get(0).get(0); // 0th index list's first value 
        int curr_max = arrays.get(0).get(arrays.get(0).size() - 1); // 0th index list's last value 
        int result = 0;

        for(int i = 1; i < arrays.size(); i++){ //start from second list in array
            n = arrays.get(i).size(); //compute the list size
            result = Math.max(result,Math.max(Math.abs(arrays.get(i).get(n-1) - curr_min), Math.abs(curr_max - arrays.get(i).get(0)) ));
            curr_min = Math.min(curr_min,arrays.get(i).get(0) );
            curr_max = Math.max(curr_max,arrays.get(i).get(n-1));

        }
        return result;
    }
}
