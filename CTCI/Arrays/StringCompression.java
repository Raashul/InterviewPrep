public class Solution{

	//a = a
	//aaa = a3
	//aaabbb=a3b3
	//aaabccc= a3b1c3
	// aaab = a3b1

	public String compression(String str){

		if(str == null){
			return str;
		}

		String output = "";
		int sum = 1;

		for(int i=0; i < str.length()-1; i++){

			if(str.charAt(i) == str.charAt(i+1))
				sum++;
			else{
				//not output += str.char(i) + sum (because it will reuturn an integer)
				output = ouput + str.charAt(i) + sum;
				sum = 1;
			}
		}

		output = output + str.charAt(str.lenth()-1) + sum;

		//check if the output length > original string
		if(output.length() < str.length())
			return output;
		else
			return str;


	}

}