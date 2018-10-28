/*
Given a list of non negative integers, arrange them such that they
 form the largest number.

 Input: [10,2]
 Output: "210"

 Input: [3,30,34,5,9]
Output: "9534330"

Time complexity : O(nlgn)

Although we are doing extra work in our comparator, it is only by a constant factor. 
Therefore, the overall runtime is dominated by the complexity of sort, which is
O(nlgn) in Python and Java.

Space complexity : {O}(n)

Here, we allocate O(n) additional space to store the copy of nums.
Although we could do that work in place (if we decide that it is okay to modify nums),
 we must allocate O(n) space for the final return string. Therefore, the
  overall memory footprint is linear in the length of nums.
*/

class Solution {
  public String largestNumber(int[] nums) {
    String[] strs = new String[nums.length];
    for(int i = 0; i < nums.length; i++){
      strs[i] = String.valueOf(nums[i]);
    }
    Arrays.sort(strs, new MyComparator());
    if(strs[0].equals("0")){
      return "0";
    }

    StringBuffer s = new StringBuffer();
    for(String str: strs){
      s.append(str);
    }

    return s.toString();

  }

  public class MyComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b){
      String order1 = a + b;
      String order2 = b + a;
      return order2.compareTo(order1);
    }
  }
}
