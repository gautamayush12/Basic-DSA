public class matrixArr{
    public static void main(String[] args) {
        int [][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        // Print the matrix row by row
        System.out.println("\nRow by Row:");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
        // Print 1st row 
        System.out.println("\nFirst Row:");
        for(int i=0; i<matrix.length; i++){
            System.out.print(matrix[0][i] + " ");
        }
        // Print 2nd column
        System.out.println("\nSecond Column:");
        for(int i=0; i<matrix.length; i++){
            System.out.print(matrix[i][1] + " ");
        }  
        //Print 1st column
        System.out.println("\nFirst Column:");
        for(int i=0; i<matrix.length; i++){
            System.out.print(matrix[i][0] + " ");
        } 
        // Print the matrix col by col
        System.out.println("\nCol by Col:");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[j][i] + " ");
            }
        }          
    }
}