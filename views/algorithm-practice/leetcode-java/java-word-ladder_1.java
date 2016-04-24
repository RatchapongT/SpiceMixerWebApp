public class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        Set<String> thisLevel = new HashSet<>();
        Set<String> lastLevel = new HashSet<>();
        thisLevel.add(beginWord);
        lastLevel.add(endWord);

        return solve(thisLevel, lastLevel, wordList, 1);
    }

    public int solve(Set<String> thisLevel, Set<String> lastLevel, Set<String> wordList, int level) {
        wordList.removeAll(thisLevel);
        wordList.removeAll(lastLevel);
        Set<String> nextLevel = new HashSet<>();

        for (String word : thisLevel) {
            char[] charArray = word.toCharArray();
            for (int i = 0; i < word.length(); i++) {
                char original = charArray[i];
                for (char c = 'a'; c <= 'z'; c++) {
                    charArray[i] = c;
                    String queryWord = new String(charArray);
                    if (lastLevel.contains(queryWord)) {
                        return level + 1;
                    }
                    if (wordList.contains(queryWord)) {
                        nextLevel.add(queryWord);
                    }
                }
                charArray[i] = original;
            }
        }

        if (nextLevel.size() == 0) return 0;

        if (nextLevel.size() < lastLevel.size()) {
            return solve(nextLevel, lastLevel, wordList, level + 1);
        } else {
            return solve(lastLevel, nextLevel, wordList, level + 1);
        }
    }
}