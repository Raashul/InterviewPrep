// Java program to find first non-repeating character
// Note : hashmap is used

import java.util.HashMap;

class CountIndex
{
	int count,index;

	// constructor for first occurrence
	public CountIndex(int index) {
		this.count = 1;
		this.index = index;
	}

	// method for updating count s
	public void incCount() {
		this.count++;
	}
}

class Main
{
	static final int NO_OF_CHARS = 256;

	static HashMap<Character, CountIndex> hm = new HashMap<Character, CountIndex>(NO_OF_CHARS);

	/* calculate count of characters
	in the passed string */
	static void getCharCountArray(String str)
	{
		for (int i = 0; i < str.length(); i++)
		{
			// If character already occurred,
			if(hm.containsKey(str.charAt(i)))
			{
				// updating count
				hm.get(str.charAt(i)).incCount();
			}

			// If it's first occurrence, then store the index and count = 1
			else
			{
				hm.put(str.charAt(i), new CountIndex(i));
			}

		}
      System.out.println(hm.get('g').count);
	}



	/* The method returns index of first non-repeating
	character in a string. If all characters are repeating
	then returns -1 */
	static int firstNonRepeating(String str)
	{
		getCharCountArray(str);
		int result = Integer.MAX_VALUE, i;

		/*
			leetcode
			l - (0,1)
			e- (1,3)
			t - (3,1)

		*/

		for (i = 0; i < str.length(); i++)
		{
			// If this character occurs only once and appears
			// before the current result, then update the result
			if (hm.get(str.charAt(i)).count == 1 && result > hm.get(str.charAt(i)).index){
				result = hm.get(str.charAt(i)).index;
			}

		}

	return result;
	}

	// Driver method
	public static void main (String[] args)
	{
		String str = "geeksforgeeks";
		int index = firstNonRepeating(str);

		System.out.println(index == Integer.MAX_VALUE ? "Either all characters are repeating " +
			" or string is empty" : "First non-repeating character is " + str.charAt(index));
	}
}
