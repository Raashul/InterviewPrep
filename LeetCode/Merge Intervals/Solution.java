/**
* Definition for an interval.
* public class Interval {
*     int start;
*     int end;
*     Interval() { start = 0; end = 0; }
*     Interval(int s, int e) { start = s; end = e; }
* }
*/
class Solution {
  
 //  private class IntervalComparator implements Comparator<Interval> {
 //     @Override
 //     public int compare(Interval a, Interval b) {
 //         return a.start < b.start ? -1 : a.start == b.start ? 0 : 1;
 //     }
 // }

  public List<Interval> merge(List<Interval> intervals) {
     List<Interval> res = new ArrayList<Interval>();

     if(intervals==null||intervals.size()==0)
        return res;

    // Collections.sort(intervals, new IntervalComparator());


    Collections.sort(intervals, new Comparator<Interval>(){
        public int compare(Interval i1, Interval i2){
            if(i1.start!=i2.start)
                return i1.start-i2.start;
            else
                return i1.end-i2.end;
        }
    });


    Interval pre = intervals.get(0);
    for(Interval interval: intervals){
      if(pre.end < interval.start){
        res.add(pre);
        pre = interval;
      }
      else{
        Interval merge = new Interval(pre.start, Math.max(pre.end, interval.end));
        pre = merge;
      }
    }
    res.add(pre);
    return res;
  }
}
