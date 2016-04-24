public class Solution {
    boolean meet = false;
    Map<String, List<String>> edges;

    public List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {
        Set<String> thisLevel = new HashSet<>();
        Set<String> lastLevel = new HashSet<>();
        thisLevel.add(beginWord);
        lastLevel.add(endWord);
        edges = new HashMap<String, List<String>>();
        boolean swap = false;
        while (thisLevel.size() != 0) {
            swap = false;
            wordList.removeAll(thisLevel);
            wordList.removeAll(lastLevel);
            Set<String> nextLevel = new HashSet<>();
            Set<String> temp;
            if (lastLevel.size() < thisLevel.size()) {
                swap = true;
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

                        String key = !swap ? word : queryWord;
                        String val = !swap ? queryWord : word;

                        if (!edges.containsKey(key)) {
                            edges.put(key, new ArrayList<>());
                        }

                        if (lastLevel.contains(queryWord)) {
                            edges.get(key).add(val);
                            meet = true;
                        }

                        if (!meet && wordList.contains(queryWord)) {
                            nextLevel.add(queryWord);
                            edges.get(key).add(val);
                        }
                    }
                    charArray[i] = original;
                }
            }
            thisLevel = nextLevel;
        }


        List<List<String>> result = new ArrayList<>();

        if (!meet) return result;

        List<String> path = new ArrayList<>();
        path.add(beginWord);

        DFS(result, temp, beginWord, endWord, edges);

        return result;
    }

    public void DFS(List<List<String>> result, List<String> temp, String start, String end, Map<String, List<String>> hs) {
        //we will use DFS, more specifically backtracking to build paths

        //boundary case
        if (start.equals(end)) {
            result.add(new ArrayList<String>(temp));
            return;
        }

        //not each node in hs is valid node in shortest path, if we found current node does not have children node,
        //then it means it is not in shortest path
        if (!hs.containsKey(start)) {
            return;
        }

        for (String s : hs.get(start)) {
            temp.add(s);
            DFS(result, temp, s, end, hs);
            temp.remove(temp.size() - 1);

        }
    }
}
