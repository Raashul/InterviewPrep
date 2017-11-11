// public Interval{
//   int start;
//   int end;
//   Interval(){
//     end = 0;
//     start = 0;
//   }
//   Interval(int s, int e){
//     start = s;
//     end = e;
//   }
// }


public static List<Interval> insert(List<Interval> intervals, Interval newInterval){

  int index = 0;

  while(index < intervals.size() && intervals.get(i).end < newInterval.start)
    i++;

  while(index < intervals.size() && intervals.get(i).start <= newInterval.end){
    newInterval = new Interval(Math.min(intervals.get(i).start, newInterval.start),Math.max(intervals.get(i).end), newInterval.end);

    interval.remove(i);
  }
  intervals.add(i, newInterval);
  return intervals;

}
