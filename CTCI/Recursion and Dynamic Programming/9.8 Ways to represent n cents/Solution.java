public class Solution{
	int ways = 0;
	public int makeChange(int n, int denoms){
		int next_denom =0;
		switch(denom){
			case 25:
			next_denom = 10;
			break;
			case 10:
			next_denom: 5;
			break;
			case 5:
			next_denom: 1;
			break;
			case 1:
			return 1;
		}

		for(int i =0; i * denom <= n; i++){
			ways += makeChange(n-i*denom, next_denom);
		}
		return ways;
	}

	public static void main(String[] args){
		System.out.println(makeChange(20, 25))
	}
}