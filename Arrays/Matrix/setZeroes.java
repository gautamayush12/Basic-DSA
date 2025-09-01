public class setZeroes{
    public static void setMatZeroes(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        //Identify Zero Elements and store them in Boolean array
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];
        //Traverse over Matrix
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j] == 0){
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }
        //Redesign Matrix
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(zeroRows[i] || zeroCols[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}