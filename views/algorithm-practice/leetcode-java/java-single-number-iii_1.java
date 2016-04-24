public class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) {
                set.remove(n);
            }
        }
        int[] answer = new int[2];
        Iterator<Integer> iterator = set.iterator();
        answer[0] = iterator.next();
        answer[1] = iterator.next();
        return answer;
    }
}