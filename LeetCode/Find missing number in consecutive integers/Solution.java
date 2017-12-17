public class MyClass {
    public static void main(String args[]) {
       int[] arr = {-3,-5,-2,-7,-6};
        System.out.println(findMissingNum(arr));
    }
    
  public static int findMissingNum(int[] arr){ 
		if(arr.length == 0 || arr.length == 1)
			return -1;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

		for(int n: arr){
			if(n > max)
				max = n;
			else if(n < min)
				min = n;
		}

		int sum = max * (max+1) /2 - (min-1) * min / 2;
		for(int i: arr)
			sum -= i;


			return sum;

	

    }
}


