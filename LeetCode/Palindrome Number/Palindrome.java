/*
Negative numbers should return false
*/

public class Palindrome{

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
   
   //According to question all Negative numbers should return false
  public static boolean PalindromeNumber(int n){
   if(ReverseInteger(n) < 0){
      return false;
    } else{
      return n == ReverseInteger(n);
    }
    }

public static void main(String[] args){
    System.out.println(ReverseInteger(1234));
    System.out.println(ReverseInteger(-1234));

    System.out.println(PalindromeNumber(-121));
    System.out.println(PalindromeNumber(121));
    System.out.println(PalindromeNumber(121123));
  }

}