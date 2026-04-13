class Solution {
    public int findLonelyPixel(char[][] picture) {
    
        int m = picture.length;
        int n = picture[0].length;
        
        int[] row_count = new int[m];
        int[] col_count = new int[n];


        for(int i = 0; i < m;i++){
            for(int j = 0; j < n;j++){
                if(picture[i][j] == 'B'){
                    row_count[i]++;
                    col_count[j]++;
                }
            }
        }
        int result = 0;
        for(int i = 0; i < m;i++){
            for(int j = 0; j < n;j++){
                if(picture[i][j] == 'B' && row_count[i] == 1 && col_count[j] == 1){
                    result+=1;
                }
            }
        }
        return result;
    }
}
