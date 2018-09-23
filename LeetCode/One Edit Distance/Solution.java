class Main {
  public static void main(String[] args) {
    System.out.println(oneEditDistance("peaks", "geeks"));
  }



public static boolean oneEditDistance(String str1, String str2){
  int length1 = str1.length();
  int length2 = str2.length();
  int count = 0;

  if(Math.abs(length1-length2) > 1) return false;
  int index1 = 0, index2 = 0;

  while(index1 < length1 && index2 < length2){
    if(str1.charAt(index1) != str2.charAt(index2)){
      count++;
      if(count > 1) return false;

      if(length1 > length2){
        index1++;
      }
      else{
        index2++;
      }
    }
    else{
      index1++;
      index2++;
    }
  }
  return true;
}

}
