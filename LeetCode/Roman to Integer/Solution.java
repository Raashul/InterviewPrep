class Solution {
  public int romanToInt(String s) {
    int res = 0;
    for(int i =0; i < s.length()-1; i++){
      int curr = getVal(s.charAt(i));
      int next = getVal(s.charAt(i+1));

      if(curr < next){
        res -= curr;
      }
      else{
        res += curr;
      }
    }
    return res + getVal(s.charAt(s.length()-1));
  }

  public int getVal(char c){
    switch(c){
      case 'M':
        return 1000;
      case 'D':
        return 500;
      case 'C':
        return 100;
      case 'L':
        return 50;
      case 'X':
        return 10;
      case 'V':
        return 5;
      case 'I':
        return 1;
    }
    throw new IllegalArgumentException();
  }
}
