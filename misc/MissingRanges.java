class Main{
  public static void main(String[] args){
    int[] arr =  {1,2,3,50, 75,99};
    System.out.println(findRanges(arr));
  }

  public static String findRanges(int[] arr){
    StringBuilder sb = new StringBuilder();
    if(arr.length == 0) return "";
    boolean[] temp = new boolean[101];
    for(int num: arr){
      temp[num] = true;
    }
    int index = 0;
    while(index < 100){
      if(temp[index] == false){
        int next = index + 1;
        while(temp[next] == false && next < 100){
          next++;
        }
        if(next == index + 1){
          sb.append("(" + index + ")");
        } else{
          sb.append("(" + index + "," + next + ")");
        }
        index = next;
      }
      index++;
    }
    return sb.toString();

  }
}