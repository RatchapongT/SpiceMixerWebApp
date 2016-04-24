public class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        Set<String> thisLevel = new HashSet<>();
        Set<String> lastLevel = new HashSet<>();
        thisLevel.add(beginWord);
        lastLevel.add(endWord);

        int level = 1;
        while (thisLevel.size() != 0) {
            wordList.removeAll(thisLevel);
            wordList.removeAll(lastLevel);
            Set<String> nextLevel = new HashSet<>();
            Set<String> temp;

            if (lastLevel.size() < thisLevel.size()) {
                temp = thisLevel;
                thisLevel = lastLevel;
                lastLevel = temp;
            }

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
            thisLevel = nextLevel;
            level++;

        }
        return 0;
    }
}