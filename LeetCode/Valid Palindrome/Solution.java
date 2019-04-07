class Solution {
  public boolean isPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;
    while(left < right){
      while(left < right && !isAlphan(s.charAt(left))){
        left++;
      }
        while(left < right && !isAlphan(s.charAt(right))){
        right--;
      }

      if(!isEqual(s.charAt(left), s.charAt(right)))
        return false;
      left++;
      right--;
    }
    return true;
  }
  
  public boolean isAlphan(char c){
    if((c >= 'A' && c <= 'Z')
    || (c >= 'a' && c <= 'z')
    || (c >= '0' && c <= '9'))
      return true;
    return false;
  }
  
  public boolean isEqual(char c1, char c2){
    c1 = Character.toLowerCase(c1);
    c2 = Character.toLowerCase(c2);
    return c1 == c2;
  }
}