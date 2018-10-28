/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 *
 * [1,3],[6,9]
 * [2,5]
 *
 * [1,5],[6,9]
 *
 * [1,2],[3,5],[6,7],[8,10],[12,16]
 *                             ^
 * newInterval = [3,10]
 * curr = [12,16]
 *
 * min = 3
 * max = 9
 * res = {[1,2] [3,10]}
 *
 * [1,2],[3,10],[12,16]
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> res = new ArrayList<>();
        for(int i =0; i < intervals.size(); i++){
            Interval curr = intervals.get(i);
            if(newInterval.start > curr.end){
                res.add(curr);
            }
            else if(newInterval.end < curr.start){
                res.add(newInterval);
                res.addAll(intervals.subList(i, intervals.size()));
                return res;
            }
            else{
                int start = Math.min(newInterval.start, curr.start);
                int end = Math.max(newInterval.end, curr.end);
                newInterval.start = start;
                newInterval.end = end;
            }
        }
        res.add(newInterval);
        return res;
    }
}
