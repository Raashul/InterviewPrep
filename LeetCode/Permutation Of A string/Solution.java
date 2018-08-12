

import java.io.*;
import java.util.*;



public class Solution {

  public static void main(String[] args) {
    String s = "ABCD";

    System.out.println("\nString " + s + ":\nPermutations: " + permutation(s));
  }

  public static ArrayList<String> permutation(String str){

    ArrayList<String> res = new ArrayList<String>();

    if(str == null){
      return null;
    }

    else if(str.length() == 0){
      res.add("");
      return res;
    }

    char firstChar = str.charAt(0);
    String rem = str.substring(1);

    ArrayList<String> temp = permutation(rem);

    for(String s: temp){
      for(int i =0; i <= s.length(); i++){
        res.add(swapElements(s, firstChar, i));
      }
    }
    return res;
  }

  public static String swapElements(String str, char firstChar, int index){
    String first = str.substring(0, index);
    String second = str.substring(index);

    return first + firstChar + second;
  }
}
9
