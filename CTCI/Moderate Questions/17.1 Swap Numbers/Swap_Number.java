public class Swap_Number{

  public static void swap(int a, int b){
    System.out.println("a :" + a);
    System.out.println("b: " + b);

    System.out.println("Swapping");

    a = a - b;
    b = a + b;
    a = b - a;

    /*    
     -->When a > b
      a = 10, b = 5
      
      a = a - b = 10 - 5 = 5
      b = a + b = 5 + 5  = 10 (Swapped by adding the difference)

      Change the value of a again by substracting the difference
      a = b - a = 10 - 5 = 5 (Swapped)

      -->When a < b
      a = 5, b = 10
      
      a = a - b = 5 - 10 = -5
      b = a + b = -5 + 10  = 5 (Swapped by adding the difference)

      Change the value of a again by substracting the difference
      a = b - a = 5 - (-5) =  (Swapped)

    */

    System.out.println("a :" + a);
    System.out.println("b: " + b);
  }

  public static void main(String[] args){
    swap(10, 20);
  }
}