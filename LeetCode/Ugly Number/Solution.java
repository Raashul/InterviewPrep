public class Solution{

  boolean isUgly(Integer num){

  if(num <= 0){
    return false;
  }

  if(num == 1){
    return true;
  }

  if(num % 2 == 0){
    return isUgly(num/2); //1
  }

  if(num % 3 == 0){
    return isUgly(num/3);
  }

  if(num % 5 == 0){
    return isUgly(num /5);
  }

  return false;
}

  public static boolean isUgly(int num) {
    if (num <= 0) {
      return false;
    }

    int[] divisors = {2, 3, 5};

    for(int d : divisors) {

      while (num % d == 0) {
        num /= d;
      }
    }

    return num == 1;
  }


}
