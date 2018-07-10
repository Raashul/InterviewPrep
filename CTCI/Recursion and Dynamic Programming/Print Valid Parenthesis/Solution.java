import java.io.*;
import java.util.*;

class Solution {
  public static void main(String[] args){
    System.out.println(generateParens(3));
  }
  
  public static ArrayList<String> generateParens(int count){
    ArrayList<String> validParens = new ArrayList<String>();
    char[] chr = new char[count*2];
    populateList(validParens, count, count,chr, 0);
    return validParens;
  }
  
  public static void populateList(ArrayList<String> list, int leftRemaining, int rightRemaining, char[] chr,  int count){
    
    if(leftRemaining < 0 || rightRemaining < leftRemaining)
      return;
    
    if(leftRemaining == 0 && rightRemaining == 0){
      String str = String.copyValueOf(chr);
      list.add(str);
    }
    
    else{
      if(leftRemaining > 0){
        chr[count] = '(';
        populateList(list, leftRemaining - 1, rightRemaining, chr, count+1);
      }
      
      if(rightRemaining > leftRemaining){
        chr[count] = ')';
        populateList(list, leftRemaining , rightRemaining -1, chr, count+1);
      }
      
    }
    
  }  
  
}










