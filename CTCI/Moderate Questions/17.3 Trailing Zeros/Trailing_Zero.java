public class Trailing_Zero{
	
	public static int factOf5(int num){
		int count =0;
		while(num % 5 ==0){
			count++;
			num /= 5;
		}
		return count;
	}
	
	public static int countFactZeros(int num){
		int count =0;
		for(int i=2; i <= num; i++){
			count += factOf5(i);
			
		}
		return count;
	}


	//Directly count the factorials of 5
	
	public static int secondMethod(int num){
		if(num < 1){
			return -1;
		}
		int count = 0;
		for(int i=5; num / 5 > 0; i *= 5){
			count += num / i;
		}
		return count;
	}
	

	public static void main(String[] args){
		System.out.println(countFactZeros(25));
		System.out.println(countFactZeros(10));
		
		System.out.println(secondMethod(25));
		System.out.println(secondMethod(10));
	}
}

