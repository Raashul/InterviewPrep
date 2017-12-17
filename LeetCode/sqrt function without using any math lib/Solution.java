public class sqr{

	public static int findSqr(int x){
	    
    int start = 1, end = x, mid = 0, ans = mid;
    
    while(start <= end){
      mid = (start + end) / 2;
      if(mid * mid == x)
          return mid;
      else if(mid * mid < x){
          start = mid + 1;
          ans = mid;
      }
      else{
          end = mid - 1;
      }
    }
    return ans;
    
    
	}
}