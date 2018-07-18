// 0, 1, 1, 2, 3, 5, 8
/*
  fib(n) = fib(n-1) + fib(n-2)
  //recursion

            5   there is repition. dynamic programming
          /   \
        4      3
      /  \    / \
    3    2    2  1

    0   1   1   2   3   5
    0   1  -1  -1  -1  -1
*/

public long fib(int x){

  if(x < 0) return -1;

  if(x == 0) return 0;

  long[] cache = new long[x+1];

  for(int i =1; i < cache.length; i++){
    cache[i] = -1;
  }

  cache[1] = 1;
  cache[2] = 1;

  return fib(x, cache);
}

public long fib(int x, long[] cache){

  if(cache[x] > -1)
    return cache[x];
  cache[x] = fib(x-1, cache) + fib(x-2, cache);
  return cache[x];

}
