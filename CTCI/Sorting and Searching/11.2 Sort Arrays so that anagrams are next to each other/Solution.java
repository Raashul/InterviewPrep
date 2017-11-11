/*
Write a method to sort an array of strings so that all the anagrams are next 
to each other
*/

public class Solution{

	public static String[] sort(String[] arr){
		/*
		List          linkedlist
		dgo -> 				|dog| -> |god|
		act ->				|cat| -> |tac|
		ilno - >			|lion`|
		*/
		Hashtable<String, LinkedList<String>> hash = 
		new Hashtable<String, LinkedList<String>>();
			for(String str: arr){
				String key = sortChar(str);
				if(!hash.containsKey(key)){
					hash.put(key, new LinkedList<String>());
				}
				LinkedList<String> anagrams = hash.get(key);
				anagrams.push(str);
			}

		//Convert the hashtable into array
		int index = 0;
		for(String key: hash.keySet()){
			LinkedList list = hash.get(key);
			for(String s: list){
				arr[index] = s;
				index++;
			}
		}
		return arr;

	}

	public static String sortChar(String s){
		char[] content = s.toCharArray();
		Arrays.sort(content);

		return new String(content);
	}

	public static void main(String[] args){
		String [] arr = {"dog", "cat", "lion", "god", "tac"};
		String[] result = sort(arr);
		for(int i =0; i < result.length; i++){
			System.out.println(result[i]);
		}
	}
}


