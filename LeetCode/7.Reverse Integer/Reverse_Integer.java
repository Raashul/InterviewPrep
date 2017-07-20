/*
Reverse digits of an integer.
Example1: x = 123, return 321
Example2: x = -123, return -321

*/

public class Reverse_Integer{

  public static int ReverseInteger(int test){
    long reverse = 0;
    while(test !=0 ){
      reverse = reverse * 10 + test % 10;
      test    = test / 10;

      if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
        return 0;
      }
    }
     return (int) reverse;
  }

  public static void main(String[] args){
    System.out.println(ReverseInteger(1234));
    System.out.println(ReverseInteger(-1234));
  }
}