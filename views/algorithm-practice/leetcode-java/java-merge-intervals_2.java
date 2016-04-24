/**
 * Definition for an interval.
 * public class Interval {
 * int start;
 * int end;
 * Interval() { start = 0; end = 0; }
 * Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval a, Interval b) {
                return a.start - b.start;
            }
        });
        List<Interval> result = new ArrayList<>();
        Interval previous = null;
        for (Interval interval : intervals) {
            if (previous == null || interval.start > previous.end) {
                result.add(interval);
                previous = interval;
            } else if (interval.end > previous.end) {
                previous.end = interval.end;
            }
        }
        return result;
    }
}

