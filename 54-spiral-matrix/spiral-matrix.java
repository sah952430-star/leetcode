class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int startingCol=0;
        int endingCol=n-1;
        int startingRow=0;
        int endingRow=m-1;
        while(startingCol <= endingCol && startingRow <= endingRow){
            //TOP
            for(int j= startingCol; j<=endingCol; j++){
                result.add(matrix[startingRow][j]);
            }

            //RIGHT
            for(int i=startingRow+1; i<=endingRow; i++){
                result.add(matrix[i][endingCol]);
            }

            //BUTTOM
            for(int j=endingCol-1; j>=startingCol; j--){
                if(startingRow==endingRow){
                    break;
                }    
                result.add(matrix[endingRow][j]);
            }

            //LEFT
            for(int i=endingRow-1; i>=startingRow+1; i--){
                if(startingCol==endingCol){
                    break;
                }
                result.add(matrix[i][startingCol]);
            }
            startingRow++;
            endingCol--;
            endingRow--;
            startingCol++;
        }
        return result;
    }
}