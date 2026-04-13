class Solution {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        
        int m = mat1.length;
        int n = mat2[0].length;
        int k = mat1[0].length;
        int[][] result = new int [m][n];
        for(int i = 0; i < mat1.length;i++){
            for(int j = 0; j < mat1[i].length;j++){
                if(mat1[i][j] != 0){
                    for(int col = 0; col < n; col++ ){
                        result[i][col] += mat1[i][j] * mat2[j][col];
                    }
                }
            }
        }
        return result;
    }
}
