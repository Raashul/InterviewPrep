public class Solution{

	public boolean repeatedSubstringPattern(String str){
		int length = str.length();
		StringBuilder sb = new StringBuilder();

		for(int i = length/2; i >= 1; i++){
			if(length % i == 0){
				int m = length % i;
				String subs = str.substring(0, m);
			
				for(int j =0; j < m; j++){
					sb.append(subs);
				}
			}
		}
		return sb.toString()equals(str);
	}

}