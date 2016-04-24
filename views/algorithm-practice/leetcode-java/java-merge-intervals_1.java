public class Solution {
    public List<Interval> merge(List<Interval> intervals) {

        int length = intervals.size();
        int[] starts = new int[length];
        int[] ends = new int[length];
        for (int i = 0; i < length; i++) {
            starts[i] = intervals.get(i).start;
            ends[i] = intervals.get(i).end;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);

        List<Interval> result = new ArrayList<Interval>();
        int startIndex = 0;
        for (int i = 0; i < length; i++) {
            if (i == length - 1 || starts[i + 1] > ends[i]) {
                result.add(new Interval(starts[startIndex], ends[i]));
                startIndex = i + 1;
            }
        }
        return result;
    }
}

