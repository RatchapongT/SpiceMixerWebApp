public class Solution {
    public String countAndSay(int n) {
        String previous = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder nextSequence = new StringBuilder();
            char say = previous.charAt(0);
            int count = 0;
            for (char c : previous.toCharArray()) {
                if (say == c) {
                    count++;
                } else {
                    nextSequence.append(count).append(say);
                    say = c;
                    count = 1;
                }
            }
            if (count > 0) {
                nextSequence.append(count).append(say);
            }
            previous = nextSequence.toString();
        }
        return previous;
    }
}