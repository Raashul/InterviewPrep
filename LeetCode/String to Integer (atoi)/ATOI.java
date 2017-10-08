/*
	Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. If you want a challenge, 
please do not see below and ask yourself what are the possible input cases.

*/

public class ATOI{
		
		public static int myAtoi(String str){
			
			if(str == null || str.length() == 0) return 0;

			str = str.trim();

			int sign = 1,start = 0, len = str.length();
			long sum = 0;

			char firstChar = str.charAt(start);

			if(firstChar == '+'){
				sign = 1;
				start++;
			}

			else if(firstChar == '-'){
				sign = -1;
				start++;
			}

			for(int i = start ; i < len; i++){
				if(!Character.isDigit(str.charAt(i))){
					return (int) (sign * sum);
				}
				sum = sum * 10 + str.charAt(i) - '0';

				if(sign == 1 && sum > Integer.MAX_VALUE){
					return Integer.MAX_VALUE;
				}
				if(sign == -1 && sign * sum < Integer.MIN_VALUE){
					return Integer.MIN_VALUE;
				}
			}	

			return (int) (sign * sum);


		}

	public static void main(String[] args){
		System.out.println(myAtoi("-123a123"));
		System.out.println(myAtoi("-12312312321312312"));
	}

}
