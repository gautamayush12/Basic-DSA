public class rotateImage {
    public static void rotMatrix(int[][] arr){
        int n = arr.length;
        int[][] newArr = new int[n][n];
        //Doing Transpose first
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                newArr[j][i] = arr[i][j];
            }
        }
        //Reverse Rows
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = newArr[i][n-1-j];
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
    