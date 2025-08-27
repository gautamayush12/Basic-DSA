class transposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] resMat = new int[cols][rows];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                resMat[j][i] = matrix[i][j];
            }
        } return resMat;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
        int[][] newMat = transpose(matrix);
        for(int i=0; i<newMat.length; i++){
            for(int j=0; j<newMat[0].length; j++){
                System.out.print(newMat[i][j] + " ");
            }
            System.out.println();
        }

    }
}