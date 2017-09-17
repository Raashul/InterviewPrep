import java.util.HashMap;

public class test{


	public static int returnMost(int[] arr){

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int current = arr[0];
		int maxN = 0;
		int newMax = 0;
		int k = 0;

		
		for(int i =1; i < arr.length; i++){

			if(current != arr[i]){
				map.put(current, newMax);
				
				if(newMax > maxN){
					k = current;
				}
				current = arr[i];
				newMax = 0;
			}
			else{
				newMax++;
			}
		}

		return map.get(k);

	}
	
	public static void main(String[] args){
		int[] arr = {1,1,2,3,3,3,3,3,4,4,4};
		System.out.println(returnMost(arr));
		
	}
}