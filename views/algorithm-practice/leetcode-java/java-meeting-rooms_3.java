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
    public boolean canAttendMeetings(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) return true;
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i].start;
            end[i] = intervals[i].end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int earliestEnd = end[0];
        int room = 0;
        int j = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (start[i] < earliestEnd) {
                room++;
            } else {
                earliestEnd = end[++j];
            }
        }
        return room == 1;

    }
}