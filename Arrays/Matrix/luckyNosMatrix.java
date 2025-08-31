import java.util.*;

public class luckyNosMatrix{
    public static void minRowMaxCol(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        HashSet<Integer> minRows = new HashSet<>();
        HashSet<Integer> maxCols = new HashSet<>();

        //Min Ele in All Rows
        for(int i=0; i<rows; i++){
            int min_ele = matrix[i][0];
            for(int j=0; j<cols; j++){
                if(matrix[i][j] < min_ele ){
                    min_ele = matrix[i][j];
                }
            } minRows.add(min_ele);
        }
        //Max Ele in All Cols
        for(int i=0; i<cols; i++){
            int max_ele = matrix[0][i];
            for(int j=0; j<rows; j++){
                if(matrix[j][i] > max_ele){
                    max_ele = matrix[j][i];
                }
            } maxCols.add(max_ele);
        }
        //Find Intersection in both Sets and return that unique value
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(minRows.contains(matrix[i][j]) && maxCols.contains(matrix[i][j])){
                    list.add(matrix[i][j]);
                }
            }
        }        
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}