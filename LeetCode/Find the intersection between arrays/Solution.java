class Solution {

  //Runtime - O(nlogn)

  public int[] intersect(int[] nums1, int[] nums2) {
    int index1 = 0;
    int index2 = 0;
    int index = 0;
    int len1 = nums1.length;
    int len2 = nums2.length;
    Arrays.sort(nums1);
    Arrays.sort(nums2);

    int[] arr = new int [ len1 > len2 ? len1 : len2 ];

    while(index1 < nums1.length && index2 < nums2.length){
      if(nums1[index1] == nums2[index2]){
        arr[index] = nums1[index1];
        index1++;
        index2++;
        index++;
      }
      else if(nums1[index1] > nums2[index2]){
        index2++;
      }
      else{
        index1++;
      }
    }

    return Arrays.copyOf(arr, index);

  }
}

class Solution {
  public int[] intersect(int[] nums1, int[] nums2) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    ArrayList<Integer> res = new ArrayList<Integer>();
    for(int num1: nums1){
      if(map.containsKey(num1)){
        map.put(num1, map.get(num1) + 1);
      }
      else{
         map.put(num1, 1);
      }
    }

    for(int num2: nums2){
      if(map.containsKey(num2) && map.get(num2) > 0){
        res.add(num2);
        map.put(num2, map.get(num2) -1);
      }
    }
    int[] resArr = new int[res.size()];
    for(int i=0; i < res.size(); i++){
      resArr[i] = res.get(i);
    }
    return resArr;
  }
}
