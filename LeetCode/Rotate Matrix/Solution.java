public class Solution {
	public void rotate(ArrayList<ArrayList<Integer>> a) {
	    transposeMatrix(a);

	    for(int i = 0; i < a.size();i++){
	        int start = 0;
	        int end  = a.get(i).size()-1;
	        while(start < end){
	            int temp1 = a.get(i).get(start);
	            int temp2 = a.get(i).get(end);
	            a.get(i).set(start, temp2);
	            a.get(i).set(end, temp1);
	            start++;
	            end--;
	        }
	    }
	}

	public void transposeMatrix(ArrayList<ArrayList<Integer>> a){
	    for(int i =0; i < a.size(); i++){
	        for(int j = i+1; j < a.get(i).size(); j++){
	            int temp1 = a.get(i).get(j);
	            int temp2 = a.get(j).get(i);
	            a.get(i).set(j, temp2);
	            a.get(j).set(i, temp1);

	        }
	    }
	}
}


//2d array as input

class Solution {
  public void rotate(int[][] matrix) {
    transposeImage(matrix);

    //reverse rows
    for(int row = 0; row < matrix.length; row++){
      int i = 0;
      int j = matrix[row].length-1;
      while(i < j){
        int temp = matrix[row][i];
        matrix[row][i] = matrix[row][j];
        matrix[row][j] = temp;
        i++;
        j--;
      }
    }
  }

  public void transposeImage(int[][] matrix){
    for(int i =0; i < matrix.length; i++){
      for(int j = i+1; j < matrix[i].length; j++){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
  }

}
