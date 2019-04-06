/*
Given a set of candidate numbers (candidates) (without duplicates) and a 
target number (target), find all unique combinations in candidates where the 
candidate numbers sums to target.

The same repeated number may be chosen from candidates unlimited number of 
times.



*/

//candidates = [2,3,6,7], target = 7,
import java.util.*;

class Solution{

  public static void main(String[] args){
    int[] a = {2,3,5};
    int target = 8;

    System.out.println(combinationSum(a, target));
  }

  public static ArrayList<ArrayList<Integer>> combinationSum(int[] nums, int target){
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    Arrays.sort(nums);
    helper(nums, target, res, new ArrayList<>(), 0);
    return res;
  }

  public static void helper(int[] nums, int target, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> temp, int start){

    if(target < 0) return;
    if(target == 0) res.add(new ArrayList<>(temp));

    for(int i = start; i < nums.length; i++){
      temp.add(nums[i]);
      helper(nums, target - nums[i], res, temp, i); //resuse the same elements
      temp.remove(temp.size()-1);
    }

  }

}
